package miKdev.stringUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {
    @Test
    void shouldRepeatThreeTimes() {
        String result = StringUtil.repeat("abc", 3);
        Assertions.assertEquals("abcabcabc", result);
    }

    @Test
    void shouldRepeatZeroTimes() {
        String result = StringUtil.repeat("", 0);
        Assertions.assertEquals("", result);
    }

    @Test
    void shouldThrowAnException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("abc", -1);
        });
    }

    @Test
    void shouldReturnTrueIfIsEmpty() {
        Assertions.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    void shouldReturnFalseIfIsNotEmpty() {
        Assertions.assertFalse(StringUtil.isEmpty("abc"));
    }

    @Test
    void shouldReturnTrueIfIsNull() {
        Assertions.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    void shouldReturnTrueIfContainsOnlySpaces() {
        Assertions.assertTrue(StringUtil.isEmpty("   "));
    }
}