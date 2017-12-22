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
    private HashMap<Aluno,Integer> faltas;
    private int capacidadeMaxima;
    private String sala;
    private String tipoAula;
    private Professor profALecionar;

    public Turno(String hora, String codigo, int capacidadeMaxima, String sala, String tipoAula) {
        this.hora = hora;
        this.codigo = codigo;
        this.capacidadeMaxima = capacidadeMaxima;
        this.sala = sala;
        this.tipoAula = tipoAula;
    }

    public String getHora() {
        return hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public HashMap<Aluno, Integer> getFaltas() {
        return faltas;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public String getSala() {
        return sala;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public Professor getProfALecionar() {
        return profALecionar;
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

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public void setProfALecionar(Professor profALecionar) {
        this.profALecionar = profALecionar;
    }
    
    
    
}
