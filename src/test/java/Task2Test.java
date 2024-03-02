//В блоке main реализована прикладная задача по вычислению квадратных корней уравнения через дискриминант.
// Вам необходимо покрыть данную реализацию формулы тестам с использованием библиотеки JUnit (уже добавлена в pom)

import org.example.Task2.MathService;
import org.example.Task2.NotFoundAnswerException;
import org.example.Task2.Pair;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2Test {
    static MathService mathService;

    @BeforeEach
    void init() {

        mathService = new MathService();
    }

    @ParameterizedTest
    @CsvSource(value = {"1,8,5"})
    public void discriminantTest(int a, int b, int c) {
        int discriminant = mathService.getD(a, b, c);
        Assertions.assertEquals(44, discriminant);
    }
    @ParameterizedTest
    @CsvSource(value = {"1,-2, 1"})
    void getXWhenDiscriminantEqual0Test(int a, int b, int c) throws NotFoundAnswerException {
        Pair pair = mathService.getAnswer(a, b, c);
        Assertions.assertEquals(1, pair.first);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,8,5"})
    void getXWhenDiscriminantMore0Test(int a, int b, int c) throws NotFoundAnswerException, NotFoundAnswerException {
        Pair pair = mathService.getAnswer(a, b, c);
        Assertions.assertEquals(-0.4566, Math.round(pair.first), 4);
        Assertions.assertEquals(-4.8766, Math.round(pair.second), 4);
    }


    @ParameterizedTest
    @CsvSource(value = {"1,2,5"})
    void getXWhenDiscriminantLess0Test(int a, int b, int c) {
        Throwable exc = assertThrows(NotFoundAnswerException.class,
                () -> mathService.getAnswer(a, b, c));
        Assertions.assertEquals("Нет корней дискриминанта", "Нет корней дискриминанта");
    }
}

