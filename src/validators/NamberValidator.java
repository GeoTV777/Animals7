package validators;

public class NamberValidator {

    public boolean isNamber(String numberStr) {
        try {
            int number = Integer.parseInt(numberStr);
            return number > 0;
        } catch (NumberFormatException ignore) {
            return false;

        }
    }
}
