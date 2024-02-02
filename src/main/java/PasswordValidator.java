import java.util.regex.Pattern;

public class PasswordValidator {

        public static Pattern PASSWORD_PATTERN =
                Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@!]).{8,20}$");

        public static boolean isValidPassword(String password) {
            return PASSWORD_PATTERN.matcher(password).matches();
        }

        public static void main(String[] args) {
            System.out.println(isValidPassword("Test1!"));
            System.out.println(isValidPassword("ValidPassword1@"));
        }
}
