/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.aulas;

import business.trocas.Troca;
import business.pessoal.Professor;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author tiagofraga
 */
public class UnidadeCurricular {
    
    private String codigo;
    private String nome;
    private ArrayList<Turno> turnos;
    private ArrayList<Professor> professores;
    private Professor regente;
    private HashMap<Turno, ArrayList<Troca>> listaTrocas;
    private int ano;

    public UnidadeCurricular(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public Professor getRegente() {
        return regente;
    }

    public HashMap<Turno, ArrayList<Troca>> getListaTrocas() {
        return listaTrocas;
    }

    public int getAno() {
        return ano;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public void setRegente(Professor regente) {
        this.regente = regente;
    }

    public void setListaTrocas(HashMap<Turno, ArrayList<Troca>> listaTrocas) {
        this.listaTrocas = listaTrocas;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
