package org.uminho.sgt.business.trocas;

import org.uminho.sgt.business.aulas.Turno;
import org.uminho.sgt.business.aulas.UnidadeCurricular;

public class PedidoTroca extends Troca {

  private int numDestino;

  // **************************************************************************************************************
  // ******************************************* Construtores
  // *****************************************************

  public PedidoTroca(int numOrigem, String estado, String ucString, int numDestino) {
    super(numOrigem, estado, ucString);
    this.numDestino = numDestino;
  }

  public PedidoTroca(
      Turno origem, Turno destino, int numero, UnidadeCurricular aThis, int numero0) {
    super(numero, "Pendete", origem, destino, aThis);
    this.numDestino = numero0;
  }

  // **************************************************************************************************************
  // ******************************************* Get's e Set's
  // ****************************************************

  public int getNumDestino() {
    return this.numDestino;
  }

  public void setNumDestino(int numDestino) {
    this.numDestino = numDestino;
  }

  @Override
  public String toString() {
    return "*PT* "
        + getNumOrigem()
        + " ** UC= "
        + getUc().getAbreviatura()
        + ":"
        + getOrigem()
        + " -> "
        + getDestino()
        + " ->"
        + this.numDestino;
  }
}
