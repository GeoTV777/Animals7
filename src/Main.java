import animals.Animal;
import data.AnimalData;
import data.ColorData;
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
                    System.out.println("Выберите тип животного: ");
                    for (AnimalData animalData: AnimalData.values()) {
                        System.out.println(animalData.name());
                    }
                    String animalType = scanner.next();

                    System.out.println("Введите имя животного");
                    String name = scanner.next();

                    System.out.println("Введите возраст животного");
                    String ageStr = scanner.next();

                    System.out.println("Введите вес животного");
                    String weightStr = scanner.next();

                    System.out.println("Выберите цвет животного:");
                    for (ColorData colorData: ColorData.values()) {
                        System.out.println(colorData.name());
                    }
                    String colorStr = scanner.next();
//                    Animal animal = animalFactory.create(animalType,name,ageStr, weightStr,colorStr);
//                    animalList.add(animal);
//                    break;

                case LIST:
                    for (Animal animal1: animalList){
                        System.out.println(animal1.toString());
                    }
                    break;

                case EXIT:
                   System.exit(0);
            }
        }

    }
}