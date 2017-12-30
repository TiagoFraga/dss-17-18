/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.trocas;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;


public class TrocaNormal extends Troca {
    
    //**************************************************************************************************************
    //******************************************* Construtores *****************************************************

    
    public TrocaNormal(int numOrigem, String estado,String ucString) {
        super(numOrigem, estado,ucString);
    }

    public TrocaNormal(Turno origem, Turno destino, int numero, UnidadeCurricular aThis) {
        super(numero,"Pendente", origem, destino, aThis);
    }
    
    //**************************************************************************************************************
    //******************************************* Get's e Set's ****************************************************
    
    @Override
    public String toString() {
        return "*T* " + getNumOrigem() + " ** UC= " + getUc().getAbreviatura() + ":"+ getOrigem().getTipoAula() + " -> " + getDestino().getTipoAula();
    }
    
    
}
