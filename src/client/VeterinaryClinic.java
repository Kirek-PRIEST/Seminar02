package client;

import client.imple.Doctor;
import client.imple.Nurse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeterinaryClinic {

    public List<Personal> personals = new ArrayList<>();
    public List<Animal> patients = new ArrayList<>();
    public void toHire(Personal personal){
    personals.add(personal);
    }
    public void toFire(){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Кого хотите уволить?");
        for (int i = 0; i < personals.size(); i++) {
            System.out.println(String.format("%s. %s", i +1,personals.get(i)));
        }
        int choice = in.nextInt();
        if (choice > personals.size()){
            System.out.println("введите число от 1 до " + personals.size() + 1);
            toFire();
        }
        System.out.println("Вы уволили: " + personals.remove(choice-1));
        System.out.println();
        System.out.println(personals.size() + " Остались:");
        for (int i = 0; i < personals.size(); i++) {
            System.out.println(personals.get(i));
        }
        in.close();

    }
    public void toAccept(Animal animal){
        patients.add(animal);
    }
    public void toDischarge(){

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Кого зотите выписать?");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(String.format("%s. %s", i +1,patients.get(i)));
        }
        int choice = in.nextInt();
        if (choice > patients.size()){
            System.out.println("введите число от 1 до " + patients.size() + 1);
            toFire();
        }
        System.out.println("Вы выписали: " + patients.remove(choice-1));
        System.out.println();
        System.out.println(patients.size() + " Остались:");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i));
        }
        in.close();
    }
}
