package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**Classe GerenciamentoVotação. */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfComputado = new ArrayList<String>();
  private int totalVotos = 0;

  public int getTotalVotos() {
    return totalVotos;
  }

  public void setTotalVotos(int totalVotos) {
    this.totalVotos = totalVotos + 1;
  }

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
    if (pessoasEleitoras.stream().anyMatch(pessoa -> pessoa.getCpf().equals(cpfPessoaEleitora))) {
      Mensagens.pessoaEleitoraJaVotou();
    }
    for (int i = 0; i < pessoasCandidatas.size(); i += 1) {
      if (pessoasCandidatas.get(i).getNumero() == numPessoaCandidata) {
        pessoasCandidatas.get(i).receberVotos();
        cpfComputado.add(cpfPessoaEleitora);
        setTotalVotos(getTotalVotos());
        break;
      }
    }
  }
  
  /**Método de mostrar resuldado da votação. */
  public void mostrarResultado() {
    if (this.getTotalVotos() == 0) {
      Mensagens.naoHaVotoComputado();
    } else {
      for (int i = 0; i < pessoasCandidatas.size(); i += 1) {
        Mensagens.resultadosVotacao(pessoasCandidatas, calcularPorcentagemVotos(i), i);
      }
      Mensagens.totalDeVotos(totalVotos);
    }
  }
  
  /**Método de calcular porcentagem de votos dos candidatos. */
  private double calcularPorcentagemVotos(int indicePessoaCandidata) {
    return pessoasCandidatas.get(indicePessoaCandidata).getVotos() * 100 / this.totalVotos;
  }


}
