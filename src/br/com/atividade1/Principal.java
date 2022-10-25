package br.com.atividade1;

public class Principal {
  public static void main(String[] args) {
    Carro carro1 = new Carro("Palio", "cinza");
    Carro carro2 = new Carro("Gol", "Preto");
    Agencia agencia = new Agencia("Agencia do Seu Zé");

    agencia.adicionaCarro(carro1);
    agencia.adicionaCarro(carro2);
    System.out.println(agencia.getQuantidadeCarro());
  }
}
