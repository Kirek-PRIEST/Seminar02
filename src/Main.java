import client.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat nyaasu = new Cat("Мяут", 4, LocalDate.of(2022, 11, 27), new Owner());
        Seel seal = new Seel("Сфил", 39, LocalDate.of(2023, 05, 14), new Owner() );
        FlyingFish flyingFish = new FlyingFish("Гаярдос", 88, LocalDate.of(1975, 7, 18), new Owner());
        Straus doduo = new Straus("Додуо", 39, LocalDate.of(2020, 12, 30), new Owner());
        Swift sterly = new Swift("Старли", 2, LocalDate.of(2023, 06, 15), new Owner());
        Duck ducklett = new Duck("Даклетт", 5, LocalDate.of(2023,02, 24), new Owner());
        System.out.println(nyaasu.getType());
        System.out.println(nyaasu);
        System.out.println("Навыки:");
        nyaasu.skills();
        System.out.println();
        System.out.println(seal.getType());
        System.out.println(seal);
        System.out.println("Навыки:");
        seal.skills();
        System.out.println();
        System.out.println(flyingFish.getType());
        System.out.println(flyingFish);
        System.out.println("Навыки:");
        flyingFish.skills();
        System.out.println();
        System.out.println(doduo.getType());
        System.out.println(doduo);
        System.out.println("Навыки:");
        doduo.skills();
        System.out.println();
        System.out.println(sterly.getType());
        System.out.println(sterly);
        System.out.println("Навыки:");
        sterly.skills();
        System.out.println();
        System.out.println(ducklett.getType());
        System.out.println(ducklett);
        System.out.println("Навыки:");
        ducklett.skills();
    }
}