package validators;

public class NamberValidator {

    public boolean isNamber(String numberStr) {
        try {
            Integer.parseInt(numberStr);
            return true;
        } catch (NumberFormatException ignore) {
            return false;

        }
    }
}
