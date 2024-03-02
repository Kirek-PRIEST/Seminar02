package client;

import java.time.LocalDate;

public class FlyingFish extends Animal{
    public FlyingFish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public FlyingFish() {
    }
    @Override
    public void toGo() {
        System.out.println("Не умеет перемещаться по земле");   }
}
