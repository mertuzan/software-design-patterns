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
class KocaeliDepo extends DepoHandler{
    //Concrete Handler
    boolean stok=false;
    @Override
    public void check(Urun urun) {
        if(stok){
            System.out.println(urun.urunAdi+" KocaeliDepo'da mevcut.");
        }else if (nextHandler != null){
            System.out.println(urun.urunAdi+" KocaeliDepo'da mevcut degil.");
            nextHandler.check(urun);
        }
    }
}