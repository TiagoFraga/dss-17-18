/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.pessoal;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;
import java.util.HashMap;
import java.util.Observable;


public abstract class Utilizador extends Observable {
    
    
    
    private int numero;
    private String nome;
    private String mail;
    private String password;
    
    
    
    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************
    
    
    public Utilizador(int numero,String nome, String mail, String password) {
        this.numero = numero;
        this.nome = nome;
        this.mail = mail;
        this.password = password;
    }
    

    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   


   
    
    
}
