package miKdev.leapYearValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearValidatorTest {

    private LeapYearValidator validator = new LeapYearValidator();

    @Test
    void shouldReturnFalseWhenYearIsNotDivisibleByFour(){
        assertFalse(validator.isLeapYear(2025));
    }

    @Test
    void shouldReturnTrueWhenYearIsDivisibleByFour(){
        assertTrue(validator.isLeapYear(2024));
    }

    @Test
    void shouldReturnFalseWhenYearIsDivisibleByOneHundred(){
        assertFalse(validator.isLeapYear(2100));
    }

    @Test
    void shouldReturnTrueWhenYearIsDivisibleByFourHundred(){
        assertTrue(validator.isLeapYear(2400));
    }
}