//baseline
// Hej med dig 
package automat;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {

    private int billetpris;    // Prisen for én billet.
    private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
    private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
    private int medlemspris;        // Prisen for én billet til medlemmer
    private boolean montørtilstand;
    private boolean medlemstilstand;
    private int medlemsType;
    private int voksen;
    private int barn;
    private int hest;
    private int cykel;
    

    Scanner input = new Scanner(System.in);

    ArrayList<String> MedlemsNavn = new ArrayList<>();
    ArrayList<String> Mail = new ArrayList<>();
    ArrayList<Integer> Telefon = new ArrayList<>();
    ArrayList<String> MedlemsKode = new ArrayList<>();
    ArrayList<Integer> MedlemsType = new ArrayList<>();

    /**
     * Opret en billetautomat der sælger billetter til 10 kr.
     */
    public Billetautomat() {
        billetpris = 10;
        medlemspris = 5;
        balance = 0;
        antalBilletterSolgt = 0;
    }

    /**
     * Giver prisen for en billet.
     */
    public int getBilletpris() {
        int resultat = billetpris;
        return resultat;
    }

    /**
     * Modtag nogle penge (i kroner) fra en kunde.
     */
    public void indsætPenge(int beløb) {
        if (beløb > 0 && beløb <= 1000) { //Første Krav Ændring med Boolan Udtryk 
            if (balance < 1000) { // Første krav sikre at der ikke kan indsættes mere end 1000 total
                balance = balance + beløb;
            } else {
                System.err.println("Der kan max indsættes 1000 kr "); // Første krav vis over 1000 prøves at indsættes 
            }
        } else if (balance > 1000) {
            System.err.println("Max balance er 1000 kroner");
        } else if (beløb < 0) { // ændring 
            System.err.println("Hvis du ønsker penge retur tast '3'");
        } else if (beløb > 1000) { // Første Krav MAX 1000 KR kan indsættes 
            System.err.println("Det maximale beløb der kan indsættes er 1000 KR");
        } else {
            System.err.println("Forkert indtastning");
        }
    }

    /**
     * Giver balancen (beløbet maskinen har modtaget til den næste billet).
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Udskriv en billet. Opdater total og nedskriv balancen med billetprisen
     */
    public void udskrivBillet() {
        if (balance < billetpris) {
            System.err.println("Du mangler at indbetale nogle penge");
        } else if (balance >= 10) {
            System.out.println("##########B##T#########");
            System.out.println("# BlueJ Trafikselskab #");
            System.out.println("#                     #");
            System.out.println("#        Billet       #");
            System.out.println("#        " + billetpris + " kr.       #");
            System.out.println("#                     #");
            System.out.println("##########B##T#########");
            System.out.println("#       Du har        #");
            System.out.println("#        " + (balance - billetpris) + " kr         #");
            System.out.println("#      til gode       #");
            System.out.println("##########B##T#########");
            System.out.println();
            antalBilletterSolgt = antalBilletterSolgt + 1;
            balance = balance - billetpris; // Billetter koster 10 kroner
        }
    }

    // Returnerer værdikupon med penge til gode 
    public int returpenge() {
        int returbeløb = balance;
        balance = 0;
        System.out.println("##########B##T#########");
        System.out.println("# BlueJ Trafikselskab #");
        System.out.println("#                     #");
        System.out.println("#  ## VÆRDI KUPON ##  #");
        System.out.println("#   KAN UDBETALES I   #");
        System.out.println("#        BUTIK        #");
        System.out.println("##########B##T#########");
        System.out.println("#       Du har        #");
        System.out.println("#         " + returbeløb + "          #");
        System.out.println("#    Kroner til gode  #");
        System.out.println("##########B##T#########");
        System.out.println();
        return returbeløb;
    }

    // Login til montøren af billetautomaten
    void montørLogin(String adgangskode) {
        if ("1234".equals(adgangskode)) {
            montørtilstand = true;
            System.out.println("Montørtilstand aktiveret");
            System.out.println("Du kan nu angive billetpris");
        } else {
            montørtilstand = false;
            System.out.println("Montørtilstand deaktiveret");
        }
    }

    public int getTotal() {
        if (montørtilstand) {
            return billetpris * antalBilletterSolgt;
        } else {
            System.err.println("Afvist - log ind først");
            return 0;
        }
    }

    public int getAntalBilletterSolgt() {
        if (montørtilstand) {
            return antalBilletterSolgt;
        } else {
            System.err.println("Afvist - log ind først");
            return 0;
        }
    }

    public void setBilletpris(int billetpris, int voksenpris, int barnepris, int hestpris, int cykelpris) {
        this.billetpris = billetpris;
        this.voksen = voksenpris;
        this.barn = barnepris;
        this.hest = hestpris;
        this.cykel = cykelpris;
    }

    // Montøren nulstiller billetautomaten
    public void nulstil() {
        if (montørtilstand) {
            antalBilletterSolgt = 0;
        } else {
            System.err.println("Afvist - log ind først");
        }
    }

    public void setAntalBilletterSolgt(int antalBilletterSolgt) {
        if (montørtilstand) {
            this.antalBilletterSolgt = antalBilletterSolgt;
        } else {
            System.err.println("Afvist - log ind først");
        }
    }

    public boolean erMontør() {
        return montørtilstand;
    }

    public void getLog() { // Lavet en ny log metode
        System.out.println("Log: ");
        System.out.println(LocalDateTime.now());
        System.out.println("Antal solgte billetter " + getAntalBilletterSolgt());
        System.out.println("Total omsætning: " + getTotal());
    }

    public void writerLog()
            throws IOException {
        FileWriter fileWriter = new FileWriter("file.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println("Antal solgte billetter: " + getAntalBilletterSolgt() + " Styk");
        printWriter.println("Total: " + getTotal() + "Kroner");
        printWriter.close();

    }

    public boolean erMedlem() {
        return medlemstilstand;
    }

    public void rabatBillet() {
        if (medlemstilstand) {
            switch (medlemsType) {
                case 1:
                    medlemspris = voksen;
                    break;
                case 2:
                    medlemspris = barn;
                    break;
                case 3:
                    medlemspris = hest;
                    break;
                case 4:
                    medlemspris = cykel;
                    break;
            }
            this.billetpris = medlemspris;
            System.out.println("Din billetpris " + medlemspris);
        } else {
            System.out.println("Du betaler normalpris");
        }
    }

    public void tilføjMedlem() {

        System.out.println("Indtast dit fornavn: ");
        MedlemsNavn.add(input.nextLine());
        System.out.println("Indtast mail");
        Mail.add(input.nextLine());
        System.out.println("Indtast telefon");
        Telefon.add(input.nextInt());
        System.out.println("Indtast din kode");
        MedlemsKode.add(input.nextLine());
        System.out.println("Indtast medlemsType");
        System.out.println("Tast 1 for voksen");
        System.out.println("Tast 2 for barn");
        System.out.println("Tast 3 for hest");
        System.out.println("Tast 4 for cykel");
        MedlemsType.add(input.nextInt());
    }

    public void medlemLogin(String medlemskode) {
        if (MedlemsKode.contains(medlemskode)) {
            medlemstilstand = true;
            System.out.println("Du er logget ind som medlem!");
            int index = MedlemsKode.indexOf(medlemskode);
            medlemsType = MedlemsType.get(index);
        } else {
            medlemstilstand = false;

            System.out.println("Ikke medlem!");
        }
    }

    public void FTP(String[] a) throws Exception {
        FtpForbindelse f = new FtpForbindelse();
        // bemærk - vær altid MEGET FORSIGTIG med at angive adgangskoder i en fil!!
        f.forbind("192.168.0.105", "test", "Hejmeddig");

        String indhold = "Indhold af en lille fil med navnet:\nfil.txt\n";
        f.sendTekst("STOR log.txt", indhold);

        indhold = f.modtagTekst("RETR fil.txt");
        System.out.println("Fil hentet med indholdet: " + indhold);
    }
}
