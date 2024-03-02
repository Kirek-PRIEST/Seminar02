package client.imple;

import client.Animal;
import client.Goable;
import client.Owner;
import client.Swimable;

import java.time.LocalDate;

public class Seal extends Animal implements Swimable, Goable {

    public Seal(String name, float weight, LocalDate age, Owner owner, String diagnosis) {
        super(name, weight, age, owner, diagnosis);
    }

    public Seal() {
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
