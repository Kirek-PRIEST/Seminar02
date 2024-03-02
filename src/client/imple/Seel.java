package client.imple;

import client.Animal;
import client.Goable;
import client.Owner;
import client.Swimable;

import java.time.LocalDate;

public class Seel extends Animal implements Swimable, Goable {

    public Seel(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Seel() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("грызёт");
    }

    @Override
    public double swim() {
        return 24;
    }

    @Override
    public double run() {
        return 2;
    }
}
