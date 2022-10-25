package br.com.atividade2;

import java.util.ArrayList;

public class Sacolao {
  private String nome;

  ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();

  public Sacolao(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionaFruta(Fruta fruta) {
    listaFrutas.add(fruta);
  }

  public int getQuantidadeFruta() {
    return listaFrutas.size();
  }

  public double calculaPreco() {
    double valTotal = 0;
    for (Fruta fruta : listaFrutas) {
      valTotal += fruta.getValor();
    }
    return valTotal;
  }
}
