package miKdev.fizzBuzz;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzWhenDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.calculates(6));
    }

    @Test
    void shouldReturnBuzzWhenDivisibleByFive() {
        assertEquals("Buzz", fizzBuzz.calculates(5));
    }

    @Test
    void shouldReturnFizzBuzzWhenDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", fizzBuzz.calculates(15));
    }

    @Test
    void shouldReturnTheNumberWhenNotDivisibleByThreeAndFive() {
        assertEquals("1", fizzBuzz.calculates(1));
    }

}