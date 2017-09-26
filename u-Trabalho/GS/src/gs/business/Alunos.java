/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gs.business;

import gs.data.AlunosDAO;
import java.util.ArrayList;
import java.util.Observable;


/**
 *
 * @author tiagofraga
 */
public class Alunos extends Observable{
    
    /*---------------------------------VARIAVEIS DA CLASSE------------------------------------*/
    
    
    private ArrayList<Aluno> listaAlunos;
    
    /*------------------------------------CONSTRUTORES----------------------------------------*/
    
    public Alunos() {
       this.listaAlunos = new ArrayList<>();
    }

    public Alunos(Alunos lista) {
        this.listaAlunos = lista.getAlunos(); 
    }
    
 /*-------------------------------- GET'S & SET'S ----------------------------------------*/

    public ArrayList<Aluno> getAlunos() {
        return listaAlunos;
    }
    
    public void setAlunos(ArrayList<Aluno> lista){
        this.listaAlunos = lista;
    }
    
    
    /*-----------------------------------METODOS----------------------------------------------*/
    
    public void loadAlunos() {
        this.listaAlunos = AlunosDAO.listAllAlunos().getAlunos();
    }

    public void addAluno(String nome, String numero) {
        Aluno a = new Aluno();
        a.setNome(nome);
        a.setNumero(numero);
        listaAlunos.add(a);
    }

    
    
}
