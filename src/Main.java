import animals.Animal;
import animals.Duck;
import data.AnimalData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalFactory;
import validators.DataValidator;
import validators.NamberValidator;
import validators.ValidName;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        AnimalFactory animalFactory = new AnimalFactory();
        DataValidator commandValidator = new DataValidator();
        NamberValidator namberValidator = new NamberValidator();
        ValidName validName = new ValidName();


        while(true) {
            System.out.println("Введите команду: add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();

            if (!commandValidator.isValidate(commandStr, CommandsData.values())) {
                System.out.println("Введена некорректная команда");
                continue;
            }

            CommandsData commandsData = CommandsData.valueOf(commandStr);

            switch (commandsData) {

                case ADD:
                    String  animalTypeStr = "";
                    while (true) {
                        System.out.println("Выберите тип животного: ");
//           Вывод типов животных из enam
                        for (AnimalData animalData : AnimalData.values()) {
                            System.out.println(animalData.name());
                        }
                        animalTypeStr = scanner.next().toUpperCase().trim();
                        if (!commandValidator.isValidate(animalTypeStr, AnimalData.values())) {
                            System.out.println("Вы ввели некорректный тип животного");
                            continue;
                        }
                        break;
                    }
                    String animalName = "";
                    while (true) {
                        System.out.println("Введите имя животного");
                        animalName = scanner.next().toUpperCase().trim();

                        if (!validName.isValidName(animalName)) {
                            System.out.println("Вы ввели некорректное имя животного");
                            continue;
                        }
                        break;
                    }

                    int animalAge = -1;
                    while (true){
                    System.out.println("Введите возраст животного");
                    String animalAgeStr = scanner.next();
                    if (namberValidator.isNamber(animalAgeStr)){
                    animalAge = Integer.parseInt(animalAgeStr);
                    break;
                    }
                        System.out.println("Вы ввели некорректный возраст животного");
                   }

                    int animalWeight = -1;
                    while (true){
                    System.out.println("Введите вес животного");
                    String animalWeightStr = scanner.next();
                    if(namberValidator.isNamber(animalWeightStr)){
                   animalWeight = Integer.parseInt(animalWeightStr);
                   break;
                    }
                        System.out.println("Вы ввели некорреектный вес животного");
                    }
                    String colorStr = "";
                    while (true) {
                        System.out.println("Выберите цвет животного:");
                        // Вывод цветов из enum
                        for (ColorData colorData : ColorData.values()) {
                            System.out.println(colorData.name());
                        }
                        colorStr = scanner.next().toUpperCase().trim();
                        if (!commandValidator.isValidate(colorStr, ColorData.values())) {
                            System.out.println("Вы ввели некорректный цвет животного");
                            continue;
                        }
                        break;
                    }

                    Animal animal = animalFactory.create(AnimalData.valueOf(animalTypeStr), animalName, animalAge , animalWeight, ColorData.valueOf(colorStr));
                    animalList.add(animal);
                    break;

                case LIST:
                    for (Animal animal1: animalList){
                        System.out.println(animal1.toString());
                        animal1.say();
                        if (animal1 instanceof Duck){
                            Duck duck = (Duck) animal1;
                            duck.fly();
                        }
                     }
                    break;

                case EXIT:
                   System.exit(0);
            }
        }

    }

}