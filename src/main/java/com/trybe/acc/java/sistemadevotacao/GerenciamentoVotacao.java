package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**Classe GerenciamentoVotação. */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCanditadas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfComputado;
  private int totalVotos;
  
  public void cadastrarPessoaCandidata(String nome, int numero) {
    pessoasCanditadas.add(new PessoaCandidata(nome, numero));
  }
  
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
    cpfComputado.add(cpf);
  }
  
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {}
  
  public void mostrarResultado() {}
  
  private double calcularPorcentagemVotos(int indicePessoaCandidata) {
    return 0.0;
  }
}
