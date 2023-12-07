package validators;

public class DataValidator {
    public boolean isValidate(String commandStr, Enum[] commandcsData){

        for (Enum command : commandcsData) {
            if (command.name().equals(commandStr)) {
            return true;

            }
        }
        return false;
    }
    }


