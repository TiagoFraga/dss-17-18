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
public class Troca {
    
    private Turno origem;
    private Turno destino;
    private int numOrigem;
    private UnidadeCurricular uc;
    private String estado;
    
    public Troca(Turno origem, Turno destino, int numOrigem, UnidadeCurricular uc) {
        this.origem = origem;
        this.destino = destino;
        this.numOrigem = numOrigem;
        this.uc = uc;
        this.estado = "PENDENTE";
    }

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

  
    
    
    
}
