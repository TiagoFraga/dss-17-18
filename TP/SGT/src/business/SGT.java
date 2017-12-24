/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.aulas.UnidadeCurricular;
import business.pessoal.Aluno;
import business.pessoal.Professor;
import business.pessoal.Utilizador;
import java.util.HashMap;

/**
 *
 * @author tiagofraga
 */
public class SGT {

    private Utilizador online;
    private HashMap<String,UnidadeCurricular> listaUCs;
    private HashMap<Integer,Professor> listaProfs;
    private HashMap<Integer,Utilizador> listaUtilizadores;
    
 //*******************************************************************************************************************
 //*********************************** Construtores e Getter's e Setter's ********************************************
    
    public SGT(){
        this.online = null;
        this.listaUCs = new HashMap<String,UnidadeCurricular> ();
        this.listaProfs = new HashMap<Integer,Professor> ();
        this.listaUtilizadores = new HashMap<Integer,Utilizador>();
    }
    
    public Utilizador getOnline() {
        return this.online;
    }

    public HashMap<String, UnidadeCurricular> getListaUCs() {
        return this.listaUCs;
    }

    public HashMap<Integer, Professor> getListaProfs() {
        return this.listaProfs;
    }

    public HashMap<Integer, Utilizador> getListaUtilizadores() {
        return this.listaUtilizadores;
    }
     
    public void setOnline(Utilizador online) {
        this.online = online;
    }

    public void setListaUCs(HashMap<String, UnidadeCurricular> listaUCs) {
        this.listaUCs = listaUCs;
    }

    public void setListaProfs(HashMap<Integer, Professor> listaProfs) {
        this.listaProfs = listaProfs;
    }

    public void setListaUtilizadores(HashMap<Integer, Utilizador> listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }
    
    
    
    
 //*******************************************************************************************************************
 //******************************************** LOGIN E LOGOUT *******************************************************

   
    public Utilizador logIn(String numero, String password){
        for(Integer i : this.listaUtilizadores.keySet()){
            if(i == Integer.parseInt(numero)){
                Utilizador u = this.listaUtilizadores.get(i);
                String pass = u.getPassword();
                if(pass.equals(password)){
                    return u;
                }
            }
        }
        return null;
    }
   
    public void logOut(){
        this.online = null;
        this.listaUCs = new HashMap<String,UnidadeCurricular> ();
        this.listaProfs = new HashMap<Integer,Professor> ();
        this.listaUtilizadores = new HashMap<Integer,Utilizador>();
    }
   

//*******************************************************************************************************************
//******************************************** Utilizador == Professor **********************************************
   
 
//*******************************************************************************************************************
//******************************************** Utilizador == Aluno **************************************************


}
