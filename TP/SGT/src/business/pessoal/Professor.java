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
    
    private boolean isDc;
    private String abreviatura;
    
    private HashMap<UnidadeCurricular,ArrayList<Turno>> cadeiras;
    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************

    public Professor(boolean isDc, String abreviatura, int numero, String nome, String mail, String password) {
        super(numero, nome, mail, password);
        this.isDc = isDc;
        this.abreviatura = abreviatura;
        
        this.cadeiras = new HashMap<UnidadeCurricular,ArrayList<Turno>>();
    }

    public Professor(boolean isDc, String abreviatura, HashMap<UnidadeCurricular, ArrayList<Turno>> cadeiras, int numero, String nome, String mail, String password) {
        super(numero, nome, mail, password);
        this.isDc = isDc;
        this.abreviatura = abreviatura;
        this.cadeiras = cadeiras;
    }
    
    
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************

    public HashMap<UnidadeCurricular, ArrayList<Turno>> getCadeiras() {
        return cadeiras;
    }

    public boolean isIsDc() {
        return isDc;
    }

    public String getAbreviatura() {
        return this.abreviatura;
    }

    public void setCadeiras(HashMap<UnidadeCurricular, ArrayList<Turno>> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public void setIsDc(boolean isDc) {
        this.isDc = isDc;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    
    @Override
    public String toString() {
        return "*P*" + getNumero() + " -> " + getNome();
    }
    
    //**************************************************************************************************************
    //******************************************* Métodos Adicionais ***********************************************


    public void addUcs(UnidadeCurricular aThis) {
        ArrayList<Turno> lista = new ArrayList<Turno>();
        this.cadeiras.put(aThis,lista);   
    }

    public void removeTurnos(UnidadeCurricular aThis, Turno t) {
        for(UnidadeCurricular u : this.cadeiras.keySet()){
            if(u.getNome().equals(aThis.getNome())){
                this.cadeiras.get(u).remove(t);
                return;
            }
        }
    }

    public void adicionaTurnos(UnidadeCurricular aThis, Turno t) {
        this.cadeiras.get(aThis).add(t);
    }

    
    
    
    
    
    
    
}
