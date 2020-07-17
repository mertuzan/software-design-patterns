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
public interface ITelefon {
    void aramaYap(String numara);
    void mesajGonder(String numara,String mesaj);
}
