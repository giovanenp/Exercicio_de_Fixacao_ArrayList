package br.com.atividade1;

import java.util.ArrayList;

public class Agencia {
  private String nome;

  ArrayList<Carro> listaCarros = new ArrayList<Carro>();

  public Agencia(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionaCarro(Carro carro) {
    listaCarros.add(carro);
  }

  public int getQuantidadeCarro() {
    return listaCarros.size();
  }
}
