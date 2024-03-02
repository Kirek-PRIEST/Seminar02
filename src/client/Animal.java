
package client;
import java.time.LocalDate;


public class Animal {
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

    private void sleep(){
        System.out.println(getType() + " спит");
    }

    private void wakeUp(){
        System.out.println(getType()+ " проснулся");

    }

    private void wakeUp(int time){
        System.out.println(getType()+ " проснулся в " + time);

    }
    private  void eat(){
        System.out.println(getType() + " ест");
    }

    private void play(){
        System.out.println(getType() + " играет");
    }
    public void lifeCycle(){
        wakeUp();
        eat();
        play();
        sleep();
        wakeUp(2);
    }

    public void toGo(){
        System.out.println("Умеет перемещаться по земле");

    }
    public void fly(){
        System.out.println("Умеет летать");
    }
    public void swim(){
        System.out.println("Умеет плавать");
    }
    public void skills(){
        toGo();
        fly();
        swim();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String  getType(){
        return getClass().getSimpleName();

    }


    @Override
    public String toString() {
        return String.format("Имя = %s, Вес = %s, Возраст = %s года, Хозяин = %s ", name, weight, LocalDate.now().getYear() - age.getYear(),owner);
    }
}
