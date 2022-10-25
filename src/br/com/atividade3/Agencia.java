package br.com.atividade3;

import java.util.ArrayList;

public class Agencia {
  private String nome;

  ArrayList<Moto> listaMotos = new ArrayList<Moto>();

  public Agencia(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionaMoto(Moto moto) {
    listaMotos.add(moto);
  }

  public int getQuantidadeMoto() {
    return listaMotos.size();
  }
}
