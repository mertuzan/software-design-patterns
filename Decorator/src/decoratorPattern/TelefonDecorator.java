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
abstract class TelefonDecorator implements ITelefon{
    ITelefon telefon;
    
    public TelefonDecorator(ITelefon telefon){
        this.telefon=telefon;
    }

    @Override
    public void aramaYap(String numara) {
        telefon.aramaYap(numara);
    }

    @Override
    public void mesajGonder(String numara, String mesaj) {
        telefon.mesajGonder(numara, mesaj);
    }
    
}
