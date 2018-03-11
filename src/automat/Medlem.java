package automat;
// Importeringer her 

import java.util.ArrayList;
import java.util.Scanner;

public class Medlem {

    Scanner input = new Scanner(System.in);

    ArrayList<String> medlemsNavn = new ArrayList<>();
    ArrayList<String> medlemsNummer = new ArrayList<>();
    ArrayList<String> mail = new ArrayList<>();
    ArrayList<String> telefon = new ArrayList<>();
    ArrayList<String> kode = new ArrayList<>();

    /**
     *
     */
    public void tilføjMedlem() {
        while (true) {
            System.out.println("Indtast dit fornavn");
            medlemsNavn.add(input.nextLine());
        }
    }
    /*
    private boolean medlemTilstand;

    void medlemLogin(String adgangskode) {
        if ("1234".equals(adgangskode)) {
            medlemTilstand = true;
            System.out.println("Montørtilstand aktiveret");
            System.out.println("Du kan nu angive billetpris");
        } else {
            medlemTilstand = false;
            System.out.println("Montørtilstand deaktiveret");
        }
    }
/*
    /*
    public int getTotal() {
        if (montørtilstand) {
            return billetpris * antalBilletterSolgt;
        } else {
            System.err.println("Afvist - log ind først");
            return 0;
        }
        
    }
     */
}
