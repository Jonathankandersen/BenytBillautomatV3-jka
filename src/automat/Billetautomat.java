//baseline
package automat;


/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {

    private int billetpris;    // Prisen for én billet.
    private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
    private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
    private boolean montørtilstand;

    /**
     * Opret en billetautomat der sælger billetter til 10 kr.
     */
    public Billetautomat() {
        billetpris = 10;
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
            balance = balance + beløb;
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
        if (balance <= 9) {
            System.out.println("Du mangler at indbetale nogle penge");
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
    // Retunere værdi kupon med penge til gode 
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

    public void setBilletpris(int billetpris) {
        this.billetpris = billetpris;
    }

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
}
