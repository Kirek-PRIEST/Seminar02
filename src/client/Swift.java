package client;

import java.time.LocalDate;

public class Swift extends Animal{
    public Swift(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Swift() {
    }
    @Override
    public void swim() {
        System.out.println("Не умеет плавать");
    }
    @Override
    public void toGo() {
        System.out.println("Не умеет перемещаться по земле");   }
}
