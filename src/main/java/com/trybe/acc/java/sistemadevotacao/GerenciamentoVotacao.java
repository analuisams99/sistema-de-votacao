package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**Classe GerenciamentoVotação. */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfComputado = new ArrayList<String>();
  private int totalVotos = 0;

  /**Método de cadastrar uma pessoa Candidata. */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    if (pessoasCandidatas.stream().anyMatch(pessoa -> pessoa.getNumero() == numero)) {
      Mensagens.numeroPessoaCandidataJaUtilizado();
    } else {
      pessoasCandidatas.add(new PessoaCandidata(nome, numero));
    }
  }
  
  /**Método de cadastrar uma pessoa Eleitora. */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (pessoasEleitoras.stream().anyMatch(pessoa -> pessoa.getCpf().equals(cpf))) {
      Mensagens.cpfPessoaEleitoraJaCadastrado();
    } else {
      pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
    }
  }
  
  /**Método de votar. */
  public void votar(String cpfPessoaEleitora, int numPessoaCandidata) {
    PessoaCandidata candidata = new PessoaCandidata(cpfPessoaEleitora, numPessoaCandidata);

    if (pessoasEleitoras.stream().anyMatch(pessoa -> pessoa.getCpf().equals(cpfPessoaEleitora))) {
      Mensagens.pessoaEleitoraJaVotou();
    }
    if (pessoasCandidatas.stream().anyMatch(pessoa -> pessoa.getNumero() == numPessoaCandidata)) {
      candidata.receberVotos();
      cpfComputado.add(cpfPessoaEleitora);
    }
  }
  
  public void mostrarResultado() {}
  
  private double calcularPorcentagemVotos(int indicePessoaCandidata) {
    return 0.0;
  }
}
