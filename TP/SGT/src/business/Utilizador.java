/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.HashMap;


public class Utilizador {
    
    private int numero;
    private String nome;
    private String mail;
    private String password;
    private HashMap<UnidadeCurricular,Turno> cadeiras;

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

    public HashMap<UnidadeCurricular, Turno> getCadeiras() {
        return cadeiras;
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

    public void setCadeiras(HashMap<UnidadeCurricular, Turno> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public Utilizador(int numero, String nome, String mail, String password) {
        this.numero = numero;
        this.nome = nome;
        this.mail = mail;
        this.password = password;
        this.cadeiras = new HashMap<UnidadeCurricular,Turno>();
    }
    
    
}
