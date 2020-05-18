package pl.pjatk;

import org.junit.jupiter.api.Test;
import pl.pjatk.zjazd5.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,2));
    }
}