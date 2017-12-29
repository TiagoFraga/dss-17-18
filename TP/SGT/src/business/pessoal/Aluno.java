/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.pessoal;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;
import business.trocas.Troca;
import business.pessoal.Utilizador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Aluno extends Utilizador {
    
    private boolean estatuto;
    
    private HashMap<UnidadeCurricular,Turno> cadeiras;
    private HashMap <String, Boolean[]> horario;
    private ArrayList<Troca> trocas;

    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************
    
    public Aluno(boolean estatuto, int numero, String nome, String mail, String password) {
        super(numero, nome, mail, password);
        this.estatuto = estatuto;
        
        this.cadeiras = new HashMap<UnidadeCurricular,Turno>();
        this.horario = new HashMap<String,Boolean[]>();
        this.trocas = new ArrayList<Troca>();
       
    }

    public Aluno(boolean estatuto, HashMap<UnidadeCurricular, Turno> cadeiras, HashMap<String, Boolean[]> horario, ArrayList<Troca> trocas, int numero, String nome, String mail, String password) {
        super(numero, nome, mail, password);
        this.estatuto = estatuto;
        this.cadeiras = cadeiras;
        this.horario = horario;
        this.trocas = trocas;
    }
    
    
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************

    public HashMap<UnidadeCurricular, Turno> getCadeiras() {
        return cadeiras;
    }

    public boolean isEstatuto() {
        return estatuto;
    }

    public HashMap<String, Boolean[]> getHorario() {
        return horario;
    }

    public ArrayList<Troca> getTrocas() {
        return trocas;
    }

    public void setCadeiras(HashMap<UnidadeCurricular, Turno> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public void setEstatuto(boolean estatuto) {
        this.estatuto = estatuto;
    }

    public void setHorario(HashMap<String, Boolean[]> horario) {
        this.horario = horario;
    }

    public void setTrocas(ArrayList<Troca> trocas) {
        this.trocas = trocas;
    }

    @Override
    public String toString() {
        return "*A*" + getNumero() + " -> " + getNome() + "*** E:" + this.estatuto;
    }
    
    //**************************************************************************************************************
    //******************************************* Métodos Adicionais ***********************************************

    public void removeTrocas(Turno origem) {
        
        
                
                for (Iterator<Troca> iterator = this.trocas.iterator(); iterator.hasNext(); ) {
                    Troca value = iterator.next();
                    if (value.getOrigem().getCodigo().equals(origem.getCodigo())) {
                        iterator.remove();
                    }
                }
        
        
        
        
    }

    public void alteraTurno(UnidadeCurricular aThis, Turno destino) {
        this.cadeiras.put(aThis,destino);
    }

    
    
    
    
    
}
