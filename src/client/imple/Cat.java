package client.imple;

import client.Animal;
import client.Goable;
import client.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{


    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Cat() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("грызёт");
    }


    @Override
    public double run() {
        return 13;
    }
}
