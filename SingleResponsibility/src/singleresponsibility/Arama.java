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
public class Arama {
    private Telefon telefon;
    Arama(Telefon telefon){
        this.telefon=telefon;
    }
    void aramaYap(String numara){
        System.out.println(this.getClass()+"\t"+this.telefon.toString()+"\tArama yapiliyor.");
    }
    void aramaGecmisiGoruntule(){
        System.out.println(this.getClass()+"\t"+this.telefon.toString()+"\tArama gecmisi goruntuleniyor.");
    }
}
