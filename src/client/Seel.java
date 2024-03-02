package client;

import client.Animal;
import client.Owner;

import java.time.LocalDate;

public class Seel extends Animal {

    public Seel(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Seel() {
        super();
    }
    @Override
    public void fly() {
        System.out.println("Не умеет летать");   }
}
