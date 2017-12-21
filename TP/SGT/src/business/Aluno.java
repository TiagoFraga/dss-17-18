/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author tiagofraga
 */
public class Aluno extends Utilizador {
    
    private boolean estatuto;
    private HashMap <String, Boolean[]> horario;
    private ArrayList<Troca> trocas;

    public boolean getEstatuto() {
        return estatuto;
    }

    public HashMap<String, Boolean[]> getHorario() {
        return horario;
    }

    public ArrayList<Troca> getTrocas() {
        return trocas;
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

    public Aluno(int numero, String nome, String mail, String password,boolean estatuto) {
        super(numero,nome, mail,password);
        this.estatuto = estatuto;
        this.horario = new HashMap <String,Boolean[]>();
        this.trocas = new ArrayList <Troca>();
    }
    
    
    
    
    
}
