import animals.Animal;
import data.AnimalData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalFactory;
import validators.DataValidator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        AnimalFactory animalFactory = new AnimalFactory();
        DataValidator commandValidator = new DataValidator();

        while(true) {
            System.out.println("Введите команду: add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();

            if (!commandValidator.validate(commandStr, CommandsData.values())) {
                System.out.println("Введена некорректная команда");
                continue;
            }
            CommandsData commandsData = CommandsData.valueOf(commandStr);

            switch (commandsData){
                case ADD:
                    System.out.println("Выберите тип животного: ");
//           Вывод типов животных из enam
                    for (AnimalData animalData: AnimalData.values()) {
                        System.out.println(animalData.name());
                    }
                    String  animalTypeStr = scanner.next().toUpperCase().trim();
                    if (!commandValidator.validate(animalTypeStr, AnimalData.values())) {
                    System.out.println("Вы ввели некорректный тип животного");
                    continue;
                     }

                    System.out.println("Введите имя животного");
                    String name = scanner.next().trim();

//                    if (!commandValidator.validate(name)) {
//
//                        System.out.println("Вы ввели некорректное имя животного");
//                        continue;
//                    }
//              Нужен второй валидатор?
                    System.out.println("Введите возраст животного");
                    String ageStr = scanner.next();

                    System.out.println("Введите вес животного");
                    String weightStr = scanner.next();

                    System.out.println("Выберите цвет животного:");
                    for (ColorData colorData: ColorData.values()) {
                        System.out.println(colorData.name());
                    }
                    String colorStr = scanner.next().toUpperCase().trim();
                         if (!commandValidator.validate(colorStr, AnimalData.values())) {
                        System.out.println("Вы ввели некорректный цвет животного");
                        continue;
                    }





//                    Чтобы что-то получить по команде list, надо в этот лист что-то записать, вот  не понимаю как.

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