package br.com.atividade2;

public class Principal {
  public static void main(String[] args) {
    Fruta fruta1 = new Fruta("Uva", 1.90);
    Fruta fruta2 = new Fruta("Melancia", 2.99);
    Fruta fruta3 = new Fruta("Banana", 4.99);
    Sacolao sacolao = new Sacolao("Sacolão do Seu Zé");

    sacolao.adicionaFruta(fruta1);
    sacolao.adicionaFruta(fruta2);
    sacolao.adicionaFruta(fruta3);
    System.out.println(sacolao.getQuantidadeFruta());
    System.out.println(sacolao.calculaPreco());
  }
}
