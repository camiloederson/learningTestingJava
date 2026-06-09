package miKdev.passwordValidator;

public class PasswordUtil {
    public enum SecurityLevel {
        WEAK, MEDIUM, STRONG
    }

    public static SecurityLevel assetPassword(String password) {
        if (password.length() < 8 || password.matches("^[a-zA-Z]+$")) {
            return SecurityLevel.WEAK;
        }
        else if (password.matches("^[a-zA-Z0-9]+$")) {
            return SecurityLevel.MEDIUM;
        }
        else return SecurityLevel.STRONG;
    }
}
