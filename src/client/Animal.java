
package client;

import java.time.LocalDate;


public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;

    }

    public Animal() {
        this("Имя", 0, LocalDate.now(), new Owner());

    }

    public abstract void eat();

    public String  getType(){
        return getClass().getSimpleName();

    }


    @Override
    public String toString() {
        return String.format("Имя = %s, Вес = %s, Возраст = %s года, Хозяин = %s ", name, weight, LocalDate.now().getYear() - age.getYear(),owner);
    }
}
