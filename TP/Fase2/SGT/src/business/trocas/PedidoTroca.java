/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.trocas;

import business.trocas.Troca;
import business.aulas.Turno;
import business.aulas.UnidadeCurricular;


public class PedidoTroca extends Troca {
    
    private int numDestino;
    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************

    public PedidoTroca(int numOrigem, String estado,String ucString, int numDestino) {
        super(numOrigem, estado,ucString);
        this.numDestino = numDestino;
        
    }

    public PedidoTroca(Turno origem, Turno destino, int numero, UnidadeCurricular aThis, int numero0) {
        super(numero, "Pendete", origem, destino, aThis);
        this.numDestino = numero0;
    }
    
    
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************

   

    public int getNumDestino() {
        return this.numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }

    @Override
    public String toString() {
        return "*PT* " + getNumOrigem() + " ** UC= " + getUc().getAbreviatura() + ":"+ getOrigem() + " -> " + getDestino() + " ->" + this.numDestino;
    }
    
    
    
}
