/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.pessoal;

import business.pessoal.Utilizador;

/**
 *
 * @author tiagofraga
 */
public class Professor extends Utilizador {
    
    private boolean isDc;

    public boolean getIsDc() {
        return isDc;
    }

    public void setIsDc(boolean isDc) {
        this.isDc = isDc;
    }

    public Professor(int numero, String nome, String mail, String password,boolean isDc) {
        super(numero,nome, mail,password);
        this.isDc = isDc;
    }
    
    
    
}
