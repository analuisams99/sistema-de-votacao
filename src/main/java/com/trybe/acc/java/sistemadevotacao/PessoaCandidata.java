package com.trybe.acc.java.sistemadevotacao;

/**Classe PessoaCandidata. */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;
  
  /**Método construtor da classe PessoaCandidata. */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }
  
  public void receberVotos() {}
  
}
