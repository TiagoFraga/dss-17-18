/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;
import business.pessoal.Aluno;
import business.pessoal.Professor;
import business.pessoal.Utilizador;
import business.trocas.PedidoTroca;
import business.trocas.Troca;
import java.util.HashMap;


public class SGT {

    private Utilizador online;
    
    private HashMap<String,UnidadeCurricular> listaUCs;
    private HashMap<Integer,Professor> listaProfs;
    private HashMap<Integer,Aluno> listaAlunos;
    
 //*******************************************************************************************************************
 //*********************************** Construtores e Getter's e Setter's ********************************************
    
    public SGT(){
        this.online = null;
        this.listaUCs = new HashMap<String,UnidadeCurricular> ();
        this.listaProfs = new HashMap<Integer,Professor> ();
        this.listaAlunos = new HashMap<Integer,Aluno>();
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

    public HashMap<Integer, Aluno> getListaAlunos() {
        return this.listaAlunos;
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

    public void setListaUtilizadores(HashMap<Integer, Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    
    
    
 //*******************************************************************************************************************
 //******************************************** LOGIN E LOGOUT *******************************************************

   
    public Utilizador logIn(String numero, String password){
        for(Integer i : this.listaProfs.keySet()){
            if(i == Integer.parseInt(numero)){
                Professor u = this.listaProfs.get(i);
                String pass = u.getPassword();
                if(pass.equals(password)){
                    return u;
                }
            }
        }
        
        for(Integer i : this.listaAlunos.keySet()){
            if(i == Integer.parseInt(numero)){
                Aluno u = this.listaAlunos.get(i);
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
        this.listaAlunos = new HashMap<Integer,Aluno>();
    }
   

//*******************************************************************************************************************
//******************************************** Utilizador == Professor **********************************************
   
    public void moveAluno(UnidadeCurricular u, Turno origem, Turno destino, Aluno a) {
        u.moveAluno(origem, destino, a);
    }

    public void marcaFalta(UnidadeCurricular u, Turno t, Aluno a) {
        u.marcaFalta(t, a);
    }
    
    public void removeProf(UnidadeCurricular u, Professor p) {
        u.removeProf(p);
    }

    public void setRegente(UnidadeCurricular u, Professor p) {
        u.setRegente(p);
    }

    public void adicionaProf(UnidadeCurricular u, Professor p) {
        u.adicionaProf(p);
    }
    
    public void mudarProfALecionarTurno(UnidadeCurricular uc, Turno t, Professor p) {
        uc.mudarProfALecionarTurno(t,p);
    }
 
//*******************************************************************************************************************
//******************************************** Utilizador == Aluno **************************************************

    public void aceitarTroca(Aluno aluno, Troca troca) {
        UnidadeCurricular u = troca.getUc();
        if(troca instanceof PedidoTroca){
            PedidoTroca pt = (PedidoTroca) troca;
            Aluno destino = this.listaAlunos.get(pt.getNumDestino());
            u.aceitarPedidoTroca(aluno,troca,destino);
        }
    }

    public void rejeitarTroca(Aluno aluno, Troca troca) {
        UnidadeCurricular u = troca.getUc();
        if(troca instanceof PedidoTroca){
            PedidoTroca pt = (PedidoTroca) troca;
            Aluno destino = this.listaAlunos.get(pt.getNumDestino());
            u.rejeitarPedidoTroca(aluno,troca,destino);
        }
        
    }

    public void cancelarTroca(Aluno aluno, Troca troca) {
        UnidadeCurricular u = troca.getUc();
        if(troca instanceof PedidoTroca){
            PedidoTroca pt = (PedidoTroca) troca;
            Aluno destino = this.listaAlunos.get(pt.getNumDestino());
            u.cancelarPedidoTroca(aluno,troca,destino);
        }else{
            u.cancelarInscricaoTroca(aluno,troca);
        }
    }

    public boolean inscreverListaTrocas(UnidadeCurricular u, Turno origem, Turno destino, Aluno aluno) {
        boolean b = u.inscreverListaTrocas(origem, destino, aluno);
        return b;
    }
    
    public void enviarPedidoTroca(UnidadeCurricular u, Aluno aluno, Turno origem, Turno destino, Aluno enviar) {
        u.enviarPedidoTroca(aluno, origem, destino, enviar);
    }

   

}
