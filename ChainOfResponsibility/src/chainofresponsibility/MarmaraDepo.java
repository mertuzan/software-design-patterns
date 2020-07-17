/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author merth
 */

class MarmaraDepo extends DepoHandler{
    //Concrete Handler
    boolean stok=true;
    @Override
    public void check(Urun urun) {
        if(stok){
            System.out.println(urun.urunAdi+" MarmaraDepo'da mevcut.");
        }else if (nextHandler != null){
            System.out.println(urun.urunAdi+" MarmaraDepo'da mevcut degil.");
            nextHandler.check(urun);
        }
    }
}