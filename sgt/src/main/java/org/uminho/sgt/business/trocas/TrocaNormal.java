package org.uminho.sgt.business.trocas;

import org.uminho.sgt.business.aulas.Turno;
import org.uminho.sgt.business.aulas.UnidadeCurricular;

public class TrocaNormal extends Troca {

  // **************************************************************************************************************
  // ******************************************* Construtores
  // *****************************************************

  public TrocaNormal(int numOrigem, String estado, String ucString) {
    super(numOrigem, estado, ucString);
  }

  public TrocaNormal(Turno origem, Turno destino, int numero, UnidadeCurricular aThis) {
    super(numero, "Pendente", origem, destino, aThis);
  }

  // **************************************************************************************************************
  // ******************************************* Get's e Set's
  // ****************************************************

  @Override
  public String toString() {
    return "*T* "
        + getNumOrigem()
        + " ** UC= "
        + getUc().getAbreviatura()
        + ":"
        + getOrigem().getTipoAula()
        + " -> "
        + getDestino().getTipoAula();
  }
}
