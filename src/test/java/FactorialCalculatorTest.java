import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Factorial.FactorialCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {

    private static final Logger logger = LoggerFactory.getLogger(FactorialCalculatorTest.class);



    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Число должно быть неотрицательным")
    public void testFactorialOfNegativeNumber() {
        // Вызов метода, который должен выбросить исключение
        FactorialCalculator.factorial(-1);
    }

}