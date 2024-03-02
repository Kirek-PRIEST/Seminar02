package client.imple;

import client.Animal;
import client.Flyable;
import client.Owner;

import java.time.LocalDate;

public class Swift extends Animal implements Flyable {
    public Swift(String name, float weight, LocalDate age, Owner owner) {

    }

    public Swift() {
    }

    @Override
    public void eat() {
        System.out.println("клюёт");
    }

    @Override
    public double fly() {
        return 60;
    }
}
