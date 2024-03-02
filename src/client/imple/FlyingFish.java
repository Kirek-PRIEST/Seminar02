package client.imple;

import client.Animal;
import client.Flyable;
import client.Owner;
import client.Swimable;

import java.time.LocalDate;

public class FlyingFish extends Animal implements Swimable, Flyable {
    public FlyingFish(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public FlyingFish() {
    }

    @Override
    public void eat() {
        System.out.println("глотает");
    }

    @Override
    public double swim() {
        return 65;
    }

    @Override
    public double fly() {
        return 30;
    }
}
