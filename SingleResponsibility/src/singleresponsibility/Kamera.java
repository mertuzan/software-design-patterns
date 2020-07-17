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
public class Kamera {
    private Telefon telefon;
    Kamera(Telefon telefon){
        this.telefon=telefon;
    }
    void fotografCek(){
        System.out.println(this.getClass()+"\t"+this.telefon.toString()+"\tFotograf cekiliyor.");
    }
    void videoCek(){
        System.out.println(this.getClass()+"\t"+this.telefon.toString()+"\tVideo cekiliyor.");
    }
}
