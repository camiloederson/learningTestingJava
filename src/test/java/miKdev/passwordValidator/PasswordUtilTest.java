package miKdev.passwordValidator;

import org.junit.jupiter.api.Test;

import static miKdev.passwordValidator.PasswordUtil.SecurityLevel.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test
    public void ShouldReturnWeakWhenPasswordHasLessThan8Characters() {
        assertEquals(WEAK, PasswordUtil.assetPassword("123qwe$"));
    }

    @Test
    public void ShouldReturnWeakWhenPasswordHasOnlyLetters() {
        assertEquals(WEAK, PasswordUtil.assetPassword("camilovksi"));
    }

    @Test
    public void ShouldReturnMediumWhenPasswordHasDigitsAndLetters() {
        assertEquals(MEDIUM, PasswordUtil.assetPassword("123qwerty"));
    }

    @Test
    public void ShouldReturnStrongWhenPasswordHasDigitsLettersAndSymbols() {
        assertEquals(STRONG, PasswordUtil.assetPassword("123qwerty$"));
    }

}