/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.aulas;

import business.pessoal.Professor;
import business.pessoal.Aluno;
import java.util.HashMap;


public class Turno {
    
    
    
    private String hora;
    private String codigo;
    private Professor profALecionar;
    
    private HashMap<Aluno,Integer> faltas;
    private int capacidadeMaxima;
    private int aulasPrevistas;
    private String sala;
    private String tipoAula;

    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************
    
    public Turno(String hora, String codigo, int capacidadeMaxima, int aulasPrevistas, String sala, String tipoAula) {
        this.hora = hora;
        this.codigo = codigo;
        this.capacidadeMaxima = capacidadeMaxima;
        this.aulasPrevistas = aulasPrevistas;
        this.sala = sala;
        this.tipoAula = tipoAula;
    }
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************

    public String getHora() {
        return this.hora;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public HashMap<Aluno, Integer> getFaltas() {
        return this.faltas;
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public int getAulasPrevistas() {
        return this.aulasPrevistas;
    }
    

    public String getSala() {
        return this.sala;
    }

    public String getTipoAula() {
        return this.tipoAula;
    }

    public Professor getProfALecionar() {
        return this.profALecionar;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFaltas(HashMap<Aluno, Integer> faltas) {
        this.faltas = faltas;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setAulasPrevistas(int aulasPrevistas) {
        this.aulasPrevistas = aulasPrevistas;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public void setProfALecionar(Professor profALecionar) {
        this.profALecionar = profALecionar;
    }
    
    //**************************************************************************************************************
    //******************************************* Métodos Adicionais ***********************************************

    public boolean marcaFalta(Aluno a) {
        for(Aluno m : faltas.keySet()){
            if(m.getNumero() == a.getNumero()){
                int f = faltas.get(m);
                f++;
                faltas.put(m,f);
                if(f == (0.25*aulasPrevistas)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public void removeAluno(Aluno a) {
        faltas.remove((a));
    }

    public void adicionaAluno(Aluno a) {
        faltas.put(a,0);
    }

    Aluno getAluno(int numOrigem) {
        for(Aluno a : this.faltas.keySet()){
            if(a.getNumero()== numOrigem){
                return a;
            }
        }
        return null;
    }
    
    
    
}
