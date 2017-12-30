/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.trocas;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;


public abstract class Troca {
    
    private int numOrigem;
    private String estado;
    private String ucString;
    
    private Turno origem;
    private Turno destino;
    private UnidadeCurricular uc;
    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************

    public Troca(int numOrigem, String estado, String ucString) {
        this.numOrigem = numOrigem;
        this.estado = estado;
        this.ucString = ucString;
        
        this.origem = null;
        this.destino = null;
        this.uc = null;
    }

    public Troca(int numOrigem, String estado, Turno origem, Turno destino, UnidadeCurricular uc) {
        this.numOrigem = numOrigem;
        this.estado = estado;
        this.origem = origem;
        this.destino = destino;
        this.uc = uc;
    }

    
    
   
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************


    public Turno getOrigem() {
        return origem;
    }

    public Turno getDestino() {
        return destino;
    }

    public int getNumOrigem() {
        return numOrigem;
    }

    public UnidadeCurricular getUc() {
        return uc;
    }

    public String getEstado() {
        return estado;
    }

    public void setOrigem(Turno origem) {
        this.origem = origem;
    }

    public void setDestino(Turno destino) {
        this.destino = destino;
    }

    public void setNumOrigem(int numOrigem) {
        this.numOrigem = numOrigem;
    }

    public void setUc(UnidadeCurricular uc) {
        this.uc = uc;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "*T* " + this.numOrigem + " ** UC= " + uc.getAbreviatura() + ":"+ origem + " -> " + destino;
    }

    
    
  
    
    
    
}
