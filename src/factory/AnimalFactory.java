package factory;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;
import data.ColorData;
import data.AnimalData;

import static data.AnimalData.CAT;
import static data.AnimalData.DOG;

public class AnimalFactory {
    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData colorData;


    public static Animal create(AnimalData animalData, String name, int age, int weight, ColorData colorData) {
        switch (animalData){
        case CAT:
            return  new Cat(name, age, weight, colorData);
        case DOG:
            return  new Dog(name, age, weight, colorData);
        default:
            return new Duck(name, age, weight, colorData);

        }

    }
}
