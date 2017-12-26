/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.trocas;

import business.aulas.Turno;
import business.aulas.UnidadeCurricular;


public class TrocaNormal extends Troca {
    
    public TrocaNormal(Turno origem, Turno destino, int numOrigem, UnidadeCurricular uc) {
        super(origem, destino, numOrigem, uc);
    }
    
    @Override
    public String toString() {
        return "*T* " + getNumOrigem() + " ** UC= " + getUc().getAbreviatura() + ":"+ getOrigem().getTipoAula() + " -> " + getDestino().getTipoAula();
    }
    
    
}
