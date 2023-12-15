package animals;

import data.ColorData;

public abstract class Animal {
    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData color =null;

    public abstract void say();
    public void go(){
        System.out.println("Я иду");
    };
    public void drink(){
        System.out.println("Я пью");
    };
    public void eat(){
        System.out.println("Я ем");
    };

    public  Animal(String name, int age, int weight, ColorData colorData) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = colorData;
    }

    public String toString(){
        String yearPadeg = getYearPadej();
            if (yearPadeg == null) {
                return "Возраст указан некорректно";
        }

        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу %d кг, мой цвет %s",
             this.name,
             this.age,
             yearPadeg,
             this.weight,
             this.color.getName()
        );
    }

    private String getYearPadej() {

        if (this.age <= 0 || this.age > 50) {
            return null;
        }

        if (this.age >= 11 && this.age <= 19){
            return "лет";
        }

        int ostatok = this.age %10;
            if (ostatok == 0 || ostatok >= 5) {
                return "лет";
            }
            if (ostatok == 1) {
                return "год";
            }
                return "года";
            }
    }


