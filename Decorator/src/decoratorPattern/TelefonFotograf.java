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
public class TelefonFotograf extends TelefonDecorator{
    
    public TelefonFotograf(ITelefon telefon) {
        super(telefon);
    }
    
    public void fotografCek(){
        System.out.println("Fotograf cekilmistir.");
    }
    
}
