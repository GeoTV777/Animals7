import data.CommandsData;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введите команду: add/list/exit");
            String commandStr = scanner.next();

            boolean isCommandsExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr.toUpperCase().trim())) {
                    isCommandsExist = true;
                    break;
                }
            }

            if (!isCommandsExist) {
                System.out.println("Введена некорректная команда");
                continue;
            }
            System.out.println("Good!");

        }

    }
}