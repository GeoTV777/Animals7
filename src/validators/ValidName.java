package validators;
public class ValidName {
    public boolean isValidName(String animalName ){
        return !animalName .isEmpty() && animalName.matches("[a-zA-Z]+");
    }
}
