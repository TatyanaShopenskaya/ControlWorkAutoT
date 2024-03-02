//Текст задания:
//В блоке test реализовано несколько UI тестов. Вам необходимо выполнить рефакторинг
//Требования к сдаче:
//1) Использовать абстрактный класс для хранения общей логики
//2) Использовать методы before и after (JUnit 5) для вынесения повторяющихся блоков кода
//3) Оптимизировать локаторы
//4) Использовать паттерн PageObject

import org.example.Task4.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task4Test extends Abstract4Test {

    @Test
    void testGBNotEmailLogin() throws InterruptedException {
        driver.get("https://gb.ru/login");

        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.init("login", "password");

        Assertions.assertFalse(loginPage.notLogin().isEmpty());
        Assertions.assertEquals("Введите адрес электронной почты.",
                loginPage.notLogin().get(0).getText());
    }

    @Test
    void testGBWithoutPassword() {
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.initWithoutPassword("login@login.ru");

        Assertions.assertFalse(loginPage.notPassword().isEmpty());

    }
}