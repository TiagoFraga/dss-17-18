/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.pessoal;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;
import business.pessoal.Utilizador;
import java.util.ArrayList;
import java.util.HashMap;


public class Professor extends Utilizador {
    
    private HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras;
    private boolean isDc;

    public Professor(boolean isDc, int numero, String nome, String mail, String password) {
        super(numero, nome, mail, password);
        this.isDc = isDc;
    }

    public HashMap<UnidadeCurricular, ArrayList<Turno>> getCadeiras() {
        return cadeiras;
    }

    public boolean isIsDc() {
        return isDc;
    }

    public void setCadeiras(HashMap<UnidadeCurricular, ArrayList<Turno>> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public void setIsDc(boolean isDc) {
        this.isDc = isDc;
    }

    @Override
    public String toString() {
        return "*P*" + getNumero() + " -> " + getNome();
    }

    public void addUcs(UnidadeCurricular aThis) {
        this.cadeiras.put(aThis,null);
        
    }

    
    
    
    
    
    
    
}
