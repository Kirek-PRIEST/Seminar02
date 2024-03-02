package client;

import java.time.LocalDate;

public class Straus extends Animal {
    public Straus(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Straus() {
    }

    @Override
    public void swim() {
        System.out.println("Очень не люблю плавать");
    }

    @Override
    public void fly() {
        System.out.println("Не умеет летать");
    }
}


