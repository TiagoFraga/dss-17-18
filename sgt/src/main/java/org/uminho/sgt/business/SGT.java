package org.uminho.sgt.business;

import org.uminho.sgt.business.aulas.Turno;
import org.uminho.sgt.business.aulas.UnidadeCurricular;
import org.uminho.sgt.business.pessoal.Aluno;
import org.uminho.sgt.business.pessoal.Professor;
import org.uminho.sgt.business.pessoal.Utilizador;
import org.uminho.sgt.business.trocas.PedidoTroca;
import org.uminho.sgt.business.trocas.Troca;

import java.util.HashMap;

public class SGT {

  private Utilizador online;

  private HashMap<String, UnidadeCurricular> listaUCs;
  private HashMap<Integer, Professor> listaProfs;
  private HashMap<Integer, Aluno> listaAlunos;

  // *******************************************************************************************************************
  // *********************************** Construtores e Getter's e Setter's
  // ********************************************

  public SGT() {
    this.online = null;
    this.listaUCs = new HashMap<String, UnidadeCurricular>();
    this.listaProfs = new HashMap<Integer, Professor>();
    this.listaAlunos = new HashMap<Integer, Aluno>();
  }

  public SGT(
      HashMap<String, UnidadeCurricular> listaUCs,
      HashMap<Integer, Professor> listaProfs,
      HashMap<Integer, Aluno> listaAlunos) {
    this.listaUCs = listaUCs;
    this.listaProfs = listaProfs;
    this.listaAlunos = listaAlunos;
  }

  public Utilizador getOnline() {
    return this.online;
  }

  public void setOnline(Utilizador online) {
    this.online = online;
  }

  public HashMap<String, UnidadeCurricular> getListaUCs() {
    return this.listaUCs;
  }

  public void setListaUCs(HashMap<String, UnidadeCurricular> listaUCs) {
    this.listaUCs = listaUCs;
  }

  public HashMap<Integer, Professor> getListaProfs() {
    return this.listaProfs;
  }

  public void setListaProfs(HashMap<Integer, Professor> listaProfs) {
    this.listaProfs = listaProfs;
  }

  public HashMap<Integer, Aluno> getListaAlunos() {
    return this.listaAlunos;
  }

  public void setListaUtilizadores(HashMap<Integer, Aluno> listaAlunos) {
    this.listaAlunos = listaAlunos;
  }

  // *******************************************************************************************************************
  // ******************************************** LOGIN E LOGOUT
  // *******************************************************

  public Utilizador logIn(String numero, String password) {
    for (Integer i : this.listaProfs.keySet()) {
      if (i == Integer.parseInt(numero)) {
        Professor u = this.listaProfs.get(i);
        String pass = u.getPassword();
        if (pass.equals(password)) {
          return u;
        }
      }
    }

    for (Integer i : this.listaAlunos.keySet()) {
      if (i == Integer.parseInt(numero)) {
        Aluno u = this.listaAlunos.get(i);
        String pass = u.getPassword();
        if (pass.equals(password)) {
          return u;
        }
      }
    }

    return null;
  }

  public void logOut() {
    this.online = null;
    this.listaUCs = new HashMap<String, UnidadeCurricular>();
    this.listaProfs = new HashMap<Integer, Professor>();
    this.listaAlunos = new HashMap<Integer, Aluno>();
  }

  // *******************************************************************************************************************
  // ******************************************** Utilizador == Professor
  // **********************************************

  public void moveAluno(UnidadeCurricular u, Turno origem, Turno destino, Aluno a) {
    u.moveAluno(origem, destino, a);
  }

  public void marcaFalta(UnidadeCurricular u, Turno t, Aluno a) {
    u.marcaFalta(t, a);
  }

  public void removeProf(UnidadeCurricular u, Professor p) {
    u.removeProf(p);
  }

  public void setRegente(UnidadeCurricular u, Professor p) {
    u.setRegente(p);
  }

  public void adicionaProf(UnidadeCurricular u, Professor p) {
    u.adicionaProf(p);
  }

  public void mudarProfALecionarTurno(UnidadeCurricular uc, Turno t, Professor p) {
    uc.mudarProfALecionarTurno(t, p);
  }

  public void gerarTurno() {}

  // *******************************************************************************************************************
  // ******************************************** Utilizador == Aluno
  // **************************************************

  public void aceitarTroca(Aluno aluno, Troca troca) {
    UnidadeCurricular u = troca.getUc();
    if (troca instanceof PedidoTroca) {
      PedidoTroca pt = (PedidoTroca) troca;
      Aluno destino = this.listaAlunos.get(pt.getNumOrigem());
      u.aceitarPedidoTroca(aluno, troca, destino);
    }
  }

  public void rejeitarTroca(Aluno aluno, Troca troca) {
    UnidadeCurricular u = troca.getUc();
    if (troca instanceof PedidoTroca) {
      PedidoTroca pt = (PedidoTroca) troca;
      Aluno destino = this.listaAlunos.get(pt.getNumDestino());
      u.rejeitarPedidoTroca(aluno, troca, destino);
    }
  }

  public void cancelarTroca(Aluno aluno, Troca troca) {
    UnidadeCurricular u = troca.getUc();
    if (troca instanceof PedidoTroca) {
      PedidoTroca pt = (PedidoTroca) troca;
      Aluno destino = this.listaAlunos.get(pt.getNumDestino());
      u.cancelarPedidoTroca(aluno, troca, destino);
    } else {
      u.cancelarInscricaoTroca(aluno, troca);
    }
  }

  public boolean inscreverListaTrocas(
      UnidadeCurricular u, Turno origem, Turno destino, Aluno aluno) {
    boolean b = u.inscreverListaTrocas(origem, destino, aluno);
    return b;
  }

  public void enviarPedidoTroca(
      UnidadeCurricular u, Aluno aluno, Turno origem, Turno destino, Aluno enviar) {
    u.enviarPedidoTroca(aluno, origem, destino, enviar);
  }
}
