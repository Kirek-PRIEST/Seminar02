package client;

import java.time.LocalDate;

public class Cat extends Animal{


    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Cat() {
        super();
    }

    @Override
    public void swim() {
        System.out.println("Очень не люблю плавать");
    }

    @Override
    public void fly() {
        System.out.println("Не умеет летать");   }
}
