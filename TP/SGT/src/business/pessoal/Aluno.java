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


public class Aluno extends Utilizador {
    
    private HashMap<UnidadeCurricular,Turno> cadeiras;
    private boolean estatuto;
    private HashMap <String, Boolean[]> horario;
    private ArrayList<Troca> trocas;

    public Aluno(HashMap<UnidadeCurricular, Turno> cadeiras, boolean estatuto, HashMap<String, Boolean[]> horario, ArrayList<Troca> trocas, int numero, String nome, String mail, String password) {
        super(numero, nome, mail, password);
        this.cadeiras = cadeiras;
        this.estatuto = estatuto;
        this.horario = horario;
        this.trocas = trocas;
    }

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

    public void removeTrocas(Turno origem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
