//В блоке main вам дан сервис бронирования (запись на прием) - BookingService.
// Два метода не реализованы:
//1) Метод проверки занятости слота времени в СУБД
//2) Метод бронирование слота времени
//Покройте код тестами
//Требования к сдаче: Используйте мокирование и логирование

import org.example.Task3.BookingService;
import org.example.Task3.CantBookException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;




@ExtendWith(MockitoExtension.class)
public class Task3Test {
    private static final Logger logger
            = LoggerFactory.getLogger(Task3Test.class);

    @Mock
    static BookingService bookingService;

    @BeforeAll
    static void init() {
        bookingService = new BookingService();
    }

    @Test
    void positiveTask3Test() throws CantBookException {
        logger.info("Test 'positiveTask3Test' is started");
        Mockito.when(bookingService.book(anyString(), any(LocalDateTime.class), any(LocalDateTime.class)))
                .thenReturn(true);
        Assertions.assertEquals(true, bookingService
                .book("User", LocalDateTime.now(), LocalDateTime.now()));
        Mockito.verify(bookingService, Mockito.times(1)).book(anyString()
                , any(LocalDateTime.class)
                , any(LocalDateTime.class));
        Mockito.verifyNoMoreInteractions(bookingService);
        logger.info("Test 'positiveTask3Test' passed");
    }

    @Test
    void negativeTask3Test() throws CantBookException {
        logger.info("Test 'negativeTask3Test' is started");
        Mockito.doThrow(CantBookException.class)
                .when(bookingService).book(anyString(), any(LocalDateTime.class), any(LocalDateTime.class));
        Assertions.assertThrows(CantBookException.class, () -> bookingService
                .book("User", LocalDateTime.now(), LocalDateTime.now()));

        Mockito.verify(bookingService, Mockito.times(1)).book(anyString()
                , any(LocalDateTime.class)
                , any(LocalDateTime.class));
        Mockito.verifyNoMoreInteractions(bookingService);
        logger.info("Test 'negativeTask3Test' is passed");
    }
}

