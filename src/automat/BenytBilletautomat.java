package automat; //Baseline 

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BenytBilletautomat {

    public static void main(String[] arg) {
        Billetautomat automat = new Billetautomat();
        Medlem medlem = new Medlem();
        java.util.Scanner tastatur = new java.util.Scanner(System.in);

        System.out.println("BenytBilletautomat version 3");
        System.out.println(); // test 2

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("En billet koster " + automat.getBilletpris() + " kroner");
            System.out.println("Balancen er på " + automat.getBalance() + " kroner");
            System.out.println();
            System.out.println("Tast 1 for at indbetale penge");
            System.out.println("Tast 2 for at udskrive din billet");
            System.out.println("Tast 3 for at få returpengene");
            System.out.println("Tast 4 for at logge ind som medlem");
            if (automat.erMedlem()) {
                System.out.println("Tast 5 for at købe rabatbillet");
                System.out.println();
                System.out.println("Tast 20 for at logge ud som medlem");
            }
            System.out.println();
            System.out.println("Tast 10 for at logge ind som montør");
            if (automat.erMontør()) {
                System.out.println("Tast 11 for at se status (montør)");
                System.out.println("Tast 12 for at nulstille (montør)");
                System.out.println("Tast 13 for at sætte billetpris (montør)");
                System.out.println("Tast 14 for at logge ud af montørtilstand");
                System.out.println("Tast 15 for at vise logs");
                System.out.println("Tast 16 for at printe log til fil");
            }
            int valg = tastatur.nextInt();
            tastatur.nextLine();

            switch (valg) {
                case 1: {
                    System.out.print("Skriv beløb: ");
                    int beløb = tastatur.nextInt();
                    automat.indsætPenge(beløb);
                    break;
                }
                case 2: {
                    automat.udskrivBillet();
                    break;
                }
                case 3: {
                    int beløb = automat.returpenge();
                    break;
                }
                case 4: {
                    System.out.print("Skriv medlemskode: ");
                    String kode = tastatur.next();
                    automat.medlemLogin(kode);

                    break;
                }
                case 5: {
                    automat.rabatBillet();
                    break;
                }
                case 10: {
                    System.out.print("Skriv kode: ");
                    String kode = tastatur.next();
                    automat.montørLogin(kode);
                    break;

                }
                case 11: {
                    System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
                    System.out.println("Total indkomst: " + automat.getTotal() + " kr");
                    break;
                }
                case 12: {
                    automat.nulstil();
                    break;
                }
                case 13: {
                    System.out.print("Skriv beløb: ");
                    int beløb = tastatur.nextInt();
                    automat.setBilletpris(beløb);
                    break;
                }
                case 14: {
                    automat.montørLogin("");
                    break;
                }
                case 15: {

                    automat.getLog();

                    break;
                }
                case 16: {
                    try {
                        automat.writerLog();
                    } catch (IOException ex) {
                        Logger.getLogger(BenytBilletautomat.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Log printet til fil");
                    }
                    break;
                }
                default: {
                    System.out.println("Ugyldigt valg, prøv igen");
                    break;

                }
                case 20: {
                    automat.medlemLogin("");
                    automat.setBilletpris(10);
                    break;
                }

            }
        }
    }

    private static boolean liste() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
