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
public class Telefon {
    private String marka;
    private int kamera;
    public String numara;

    Telefon(String numara, String marka, int kamera){
        this.kamera=kamera;
        this.marka=marka;
        this.numara=numara;
    }
    
}
