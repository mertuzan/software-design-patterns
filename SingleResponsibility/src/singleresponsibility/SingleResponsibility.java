/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility;

/**
 *
 * @author merth
 */
public class SingleResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefon telefon = new Telefon("5554443322","samsung",16);
        Kamera kamera = new Kamera(telefon);
        Arama arama = new Arama(telefon);
        
        kamera.fotografCek();
        kamera.videoCek();
        arama.aramaYap("5554443322");
        arama.aramaGecmisiGoruntule();

    }
    
}
