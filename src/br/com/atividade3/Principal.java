package br.com.atividade3;

public class Principal {
  public static void main(String[] args) {
    Moto moto1 = new Moto("CG", "Vermelha");
    Moto moto2 = new Moto("Tyger", "Cinza");
    Agencia agencia = new Agencia("Agencia do Seu Mané");

    agencia.adicionaMoto(moto1);
    agencia.adicionaMoto(moto2);
    System.out.println(agencia.getQuantidadeMoto());
  }
}