package client.imple;

import client.Animal;
import client.Goable;
import client.Owner;

import java.time.LocalDate;

public class Straus extends Animal implements Goable {
    public Straus(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Straus() {
    }

    @Override
    public void eat() {
        System.out.println("клюёт");
    }


    @Override
    public double run() {
        return 60;
    }
}


