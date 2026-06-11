package miKdev.stringUtil;

public class StringUtil {
    public static String repeat(String s, int times) {
        if(times < 0) {
            throw new IllegalArgumentException("times cannot be negative");
        }
        return s.repeat(times);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
