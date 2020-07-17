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
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarketDepo marketHandler = new MarketDepo();
        KocaeliDepo kocaeliHandler = new KocaeliDepo();
        MarmaraDepo marmaraHandler = new MarmaraDepo();
        
        marketHandler.setNextHandler(kocaeliHandler);
        kocaeliHandler.setNextHandler(marmaraHandler);
        Urun urun = new Urun("UrunX");
        marketHandler.check(urun);
    }
    
}
