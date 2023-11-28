import animals.Animal;
import data.AnimalData;
import data.CommandsData;
import factory.AnimalFactory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        AnimalFactory animalFactory = new AnimalFactory();

        while(true) {
            System.out.println("Введите команду: add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();

            boolean isCommandsExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr)) {
                    isCommandsExist = true;
                    break;
                }
            }

            if (!isCommandsExist) {
                System.out.println("Введена некорректная команда");
                continue;
            }
            CommandsData commandsData = CommandsData.valueOf(commandStr);
            switch (commandsData){
                case ADD:
//                    System.out.println("Введите тип животного");
//                    Animal animal = animalFactory.create(AnimalData.valueOf(scanner.next()));
//                    System.out.println("Введите имя животного");
//                    animal.setName (scanner.next());
//                    System.out.println("Введите возраст животного");




                String name = scanner.next();
                String ageStr = scanner.next();
                String weightStr = scanner.next();
                String colorStr = scanner.next();


                case LIST:
                    for (Animal animal: animalList){}
                    System.out.println(animalList.toString()); // animal.toString() подсвечивает ошибку тогда
                case EXIT:
                   System.exit(0);
            }
        }

    }
}