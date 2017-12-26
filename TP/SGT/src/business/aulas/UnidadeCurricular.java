/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.aulas;

import business.pessoal.Aluno;
import business.trocas.Troca;
import business.pessoal.Professor;
import business.trocas.PedidoTroca;
import business.trocas.TrocaNormal;
import java.util.ArrayList;
import java.util.HashMap;


public class UnidadeCurricular {
    
    private String codigo;
    private String nome;
    private String abreviatura;
    private int ano;

    private Professor regente;
    private ArrayList<Professor> professores;
    
    private ArrayList<Turno> turnos;
    private HashMap<Turno, ArrayList<Troca>> listaTrocas;

    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************
    
    
    public UnidadeCurricular(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************

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

    public String getAbreviatura() {
        return this.abreviatura;
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

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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
    
    
    //**************************************************************************************************************
    //******************************************* Métodos Adicionais ***********************************************
    

    public void removeProf(Professor p) {
        for(Professor prof : this.professores){
            if(prof.getNumero() == p.getNumero()){
                this.professores.remove(prof);
                return;
            }
        }
    }

    public void adicionaProf(Professor p) {
        this.professores.add(p);
    }

    public void marcaFalta(Turno t, Aluno a) {
        boolean b = t.marcaFalta(a);
        
        if(b){
            
            for(Turno d : turnos){
                if(d.getTipoAula().equals("SemTurno")){
                    moveAluno(t,d,a);
                }
            }
            
        }
    }

    public void moveAluno(Turno origem, Turno destino, Aluno a) {
        origem.removeAluno(a);
        removeAlunoTrocas(origem,a);
        a.removeTrocas(origem);
        destino.adicionaAluno(a);
    }

    public boolean inscreverListaTrocas(Turno origem, Turno destino, Aluno aluno) {
        for(Turno t : listaTrocas.keySet()){
            
            if(t.getCodigo().equals(destino.getCodigo())){
                ArrayList<Troca> lista = listaTrocas.get(t);
                
                for(Troca tr : lista){
                    
                    if(tr.getDestino().getCodigo().equals(origem.getCodigo())){
                        
                        moveAluno(origem, destino, aluno);
                        
                        Aluno a = t.getAluno(tr.getNumOrigem());
                        moveAluno(destino,origem, a);
                        lista.remove(tr);
                        return true;
                        
                        
                    }else{
                        Troca nova = new TrocaNormal(origem,destino,aluno.getNumero(),this);
                        
                        for(Turno tu : listaTrocas.keySet()){
                            if(t.getCodigo().equals(origem.getCodigo())){
                                listaTrocas.get(tu).add(nova);
                                aluno.getTrocas().add(nova);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void enviarPedidoTroca(Aluno aluno, Turno origem, Turno destino, Aluno enviar) {
        Troca troca = new PedidoTroca(origem, destino, aluno.getNumero(), this, enviar.getNumero());
        aluno.getTrocas().add(troca);
        enviar.getTrocas().add(troca);
    }

    public void cancelarPedidoTroca(Aluno aluno, Troca troca, Aluno destino) {
        aluno.getTrocas().remove(troca);
        destino.getTrocas().remove(troca);
    }

    public void cancelarInscricaoTroca(Aluno aluno, Troca troca) {
        Turno turno = troca.getOrigem();
        this.listaTrocas.get(turno).remove(troca);
        aluno.getTrocas().remove(troca);
         
    }

    public void rejeitarPedidoTroca(Aluno aluno, Troca troca, Aluno origem) {
        aluno.getTrocas().remove(troca);
        troca.setEstado("REJEITADA");   
    }

    public void aceitarPedidoTroca(Aluno aluno, Troca troca, Aluno origem) {
        aluno.getTrocas().remove(troca);
        origem.getTrocas().remove(troca);
        
        Turno t1 = troca.getOrigem();
        Turno t2 = troca .getDestino();
        
        moveAluno(t1,t2,origem);
        moveAluno(t2,t1,aluno);
        
        
        
    }

    private void removeAlunoTrocas(Turno origem, Aluno a) {
        for(Turno t : listaTrocas.keySet()){
            if(t.getCodigo().equals(origem.getCodigo())){
                ArrayList<Troca> lista = this.listaTrocas.get(t);
                for(Troca tr : lista){
                    if(tr.getNumOrigem()== a.getNumero()){
                        lista.remove(tr);
                    }
                }
            }
        }
        
    }
    
    
}
