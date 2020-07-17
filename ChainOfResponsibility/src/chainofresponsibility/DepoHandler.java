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
public abstract class DepoHandler {
    protected DepoHandler nextHandler;
    
    public void setNextHandler(DepoHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    public abstract void check(Urun urun);
}