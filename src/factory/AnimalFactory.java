package factory;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Duck;
import data.AnimalData;
import data.ColorData;

public class AnimalFactory {
    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData colorData;

    public AnimalFactory(String name, int age, int weight, ColorData colorData){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colorData = colorData;
    }

    public Animal create(AnimalData animalData) {
        switch (animalData){
        case CAT:
            return new Cat(this.name, this.age, this.weight, this.colorData);
        case DOG:
            return  new Dog(this.name, this.age, this.weight, this.colorData);
        default:
            return new Duck(this.name, this.age, this.weight, this.colorData);

        }

    }
}
