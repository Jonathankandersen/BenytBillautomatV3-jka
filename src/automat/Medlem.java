package automat;
// Importeringer her 

import java.util.ArrayList;
import java.util.Scanner;

public class Medlem {

    Scanner input = new Scanner(System.in);

    ArrayList<String> medlemsNavn = new ArrayList<>();
    ArrayList<String> medlemsNummer = new ArrayList<>();
    ArrayList<String> mail = new ArrayList<>();
    ArrayList<Integer> telefon = new ArrayList<>();
    ArrayList<String> medlemsKode = new ArrayList<>();

    public void tilføjMedlem() {

        System.out.println("Indtast dit fornavn: ");
        medlemsNavn.add(input.nextLine());
        System.out.println("Indtast telefonnummer: ");
        medlemsNummer.add(input.nextLine());
        System.out.println("Indtast mail");
        mail.add(input.nextLine());
        System.out.println("Indtast telefon");
        telefon.add(input.nextInt());
        System.out.println("Indtast din kode");
        medlemsKode.add(input.nextLine());
    }

    private boolean medlemTilstand;

    public void medlemLogin(String adgangskode) {
        if (medlemsKode.contains(adgangskode)) {
            medlemTilstand = true;
            System.out.println("Montørtilstand aktiveret");
            System.out.println("Du kan nu angive billetpris");
        } else {
            medlemTilstand = false;
            System.out.println("Montørtilstand deaktiveret");
        }
    }
}
