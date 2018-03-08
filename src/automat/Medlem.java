/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;
// Importeringer her 
/**
 *
 * @author shuha
 */


public class Medlem {
    
    
 private boolean medlemTilstand;
 
 public void sighej() {
 
     System.out.println("hej med dig ");
}
 
 
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
    
}
