import client.*;
import client.imple.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Doctor doc2 = new Doctor("Врач", "Джеймс Хэриот", LocalDate.of(1921, 5, 14),
                                "Йоркшир", "Ассистент", LocalDate.of(1939, 5, 30));
        Nurse nurse = new Nurse("Сестра", "миссис Холл", LocalDate.of(1912, 1, 16),
                                "Йоркшир", "Экономка", LocalDate.of(1940, 6, 18));

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.toHire(doc);
        clinic.toHire(doc2);
        clinic.toHire(nurse);
        for (int i = 0; i < clinic.personals.size(); i++) {
            System.out.println(clinic.personals.get(i));
        }
        System.out.println();
        clinic.toFire();
    }
}