/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorPattern;

/**
 *
 * @author merth
 */
public class DecoratorPattern{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        
        TelefonFotograf fTelefon = new TelefonFotograf(telefon);
        
        fTelefon.aramaYap("5554443322");
        fTelefon.mesajGonder("5554443322", "test");
        fTelefon.fotografCek();
        
    }
    
}
