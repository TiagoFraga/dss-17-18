/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author tiagofraga
 */
public class PedidoTroca extends Troca {
    
    private int numDestino;

    public PedidoTroca(Turno origem, Turno destino, int numOrigem, UnidadeCurricular uc, int numDestino) {
        super(origem, destino, numOrigem, uc);
        this.numDestino = numDestino;
        
    }

    public int getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }
    
    
    
}
