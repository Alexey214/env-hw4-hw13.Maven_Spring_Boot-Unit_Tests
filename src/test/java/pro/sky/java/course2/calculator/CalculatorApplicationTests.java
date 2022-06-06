package pro.sky.java.course2.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.java.course2.calculator.exception.MyIllegalArgumentException;
import pro.sky.java.course2.calculator.service.CalculatorService;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

@SpringBootTest
class CalculatorApplicationTests {

    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    void checkPlus() {
        int a = 5;
        int b = 5;
        int c = a + b;
        int d = out.plus(5, 5);

        assertEquals(d, c);

    }

    @Test
    void checkNotNullPlus() {
        int d = out.plus(5, 5);

        assertNotNull(d);
    }

    @Test
    void checkMinus() {
        int a = 5;
        int b = 5;
        int c = a - b;
        int d = out.minus(5, 5);

        assertEquals(d, c);

    }

    @Test
    void checkNotNullMinus() {
        int d = out.minus(5, 5);

        assertNotNull(d);
    }

    @Test
    void checkMultiply() {
        int a = 5;
        int b = 5;
        int c = a * b;
        int d = out.multiply(5, 5);

        assertEquals(d, c);

    }

    @Test
    void checkNotNullMultiply() {
        int d = out.multiply(5, 5);

        assertNotNull(d);
    }

    @Test
    void checkDivide() {
        double a = 5;
        double b = 5;
        double c = a / b;
        double d = out.divide(5, 5);

        assertEquals(d, c);

    }

    @Test
    void checkNotNullDivide() {
        double d = out.divide(5, 5);

        assertNotNull(d);
    }

    @Test
    void checkIllegalArgumentExceptionForDivide() {
        assertThrows(MyIllegalArgumentException.class, () -> out.divide(5, 0));
    }
}
