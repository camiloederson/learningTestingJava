package miKdev.stringUtil;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilTest {
    @Test
    void ShouldRepeatThreeTimes() {
        String result = StringUtil.repeat("abc", 3);
        Assertions.assertEquals("abcabcabc", result);
    }

    @Test
    void ShouldRepeatZeroTimes() {
        String result = StringUtil.repeat("", 0);
        Assertions.assertEquals("", result);
    }

    @Test
    void ShouldThrowAnException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("abc", -1);
        });
    }
}