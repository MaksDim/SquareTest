import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculateEnumerationOfNumbers() {
        SQRService service = new SQRService();

        int number = 15;
        int expected = 15;

        int actual = service.calculateEnumerationOfNumbers(number);
        assertEquals(expected, actual);
    }
}