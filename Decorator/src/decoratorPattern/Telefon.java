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
public class Telefon implements ITelefon {

    @Override
    public void aramaYap(String numara) {
        System.out.println(numara+" Aranıyor...");
    }

    @Override
    public void mesajGonder(String numara, String mesaj) {
        System.out.println("\""+mesaj+"\" mesajınız "+numara+" gönderiliyor.");
    }

    
    
}
