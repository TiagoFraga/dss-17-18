/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gs.business;

import java.util.ArrayList;

/**
 *
 * @author tiagofraga
 */
public class Aluno {
    
    /*---------------------------------VARIAVEIS DA CLASSE------------------------------------*/
    
    private String nome;
    private String numero;
    private String curso;
    private String ano;
    private String morada;
    private ArrayList<Quota> quotas;
    
    /*------------------------------------CONSTRUTORES----------------------------------------*/

    public Aluno() {
       this("", "","","","",new ArrayList<>());
    }

    public Aluno(String nome, String num,String curso, String ano, String morada, ArrayList quotas) {
        this.nome = nome;
        this.numero = num;
        this.curso = curso;
        this.ano = ano;
        this.morada = morada;
        this.quotas = quotas;
    }

/*-------------------------------- GET'S & SET'S ----------------------------------------*/

    public String getNome() {
        return this.nome;
    }

    public String getNumero() {
        return this.numero;
    }
     
    public String getCurso() {
        return this.curso;
    }
    
    public String getAno() {
        return this.ano;
    }
     
    public String getMorada() {
        return this.morada;
    }
    
    public ArrayList<Quota> getCota(){
        return this.quotas;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String num ) {
        this.numero = num;
    }
    
    public void setCurso(String curso ) {
        this.curso = curso;
    }
    
    public void setAno(String ano ) {
        this.ano = ano;
    }
    
    public void setMorada(String morada ) {
        this.morada = morada;
    }
    
    public void setQuotas (ArrayList quotas){
        this.quotas = quotas;
    }
    
    public boolean equals(Object o) {
        boolean b=false;

        if (o!= null && o instanceof Aluno) {
            Aluno a = (Aluno)o;
            b = this.numero.equals(a.getNumero()) && 
                    this.nome.equals(a.getNome());    
        }
        return b;
    }
    
    public Object clone() {
        return new Aluno(this.nome, this.numero,this.curso,this.ano,this.morada, this.quotas);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("Aluno(");
        sb.append(this.numero);
        sb.append(",");
        sb.append(this.nome);
        sb.append(")");
        return sb.toString();
    }


    
    
}
