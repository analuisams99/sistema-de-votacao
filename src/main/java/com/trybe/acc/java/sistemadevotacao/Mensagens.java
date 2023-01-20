package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**Classe Mensagens. */
public class Mensagens {
  /**Método que imprime, no console, as opções para cadastro de pessoas candidatas. */
  public static void menuCadastrarPessoaCanditada() {
    System.out.println(
          "Cadastrar pessoa candidata?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:\n"
    );
  }

  /**Método que imprime, no console, a mensagem para entrar com o nome da pessoa candidata. */
  public static void entrarComNomePessoaCandidata() {
    System.out.println("Entre com o nome da pessoa candidata:\n");
  }
  
  /**Método que imprime, no console, a mensagem para entrar com o nome da pessoa candidata. */
  public static void entrarComNumeroPessoaCandidata() {
    System.out.println("Entre com o número da pessoa candidata:\n");
  }
  
  /**Método que imprime, no console, a mensagem da pessoa candidata cadastrada com sucesso. */
  public static void pessoaCandidataCadastradaComSucesso() {
    System.out.println("Pessoa candidata cadastrada com sucesso!\n");
  }

  /**Método que imprime, no console, as opções para cadastro de pessoas eleitoras. */
  public static void menuCadastrarPessoaEleitora() {
    System.out.println(
          "Cadastrar pessoa eleitora?\n"
          + "1 - Sim\n"
          + "2 - Não\n"
          + "Entre com o número correspondente à opção desejada:\n"
    );
  }
  
  /**Método que imprime, no console, a mensagem para entrar com o nome da pessoa eleitora. */
  public static void entrarComNomePessoaEleitora() {
    System.out.println("Entre com o nome da pessoa eleitora:\n");
  }
  
  /**Método que imprime, no console, a mensagem para entrar com o CPF da pessoa eleitora. */
  public static void entrarComCpfPessoaEleitora() {
    System.out.println("Entre com o cpf da pessoa eleitora:\n");
  }
  
  /**Método que imprime, no console, a mensagem da pessoa eleitora cadastrada com sucesso. */
  public static void pessoaEleitoraCadastradaComSucesso() {
    System.out.println("Pessoa eleitora cadastrada com sucesso!\n");
  }
  
  /**Método que imprime, no console, as opções de votação. */
  public static void menuDeVotacao() {
    System.out.println(
        "Entre com o número correspondente à opção desejada:\n"
          + "1 - Votar\n"
          + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação\n"
    );
  }
  
  /**Método que imprime, no console, a mensagem que o numero da pessoa candidata já está em uso. */
  public static void numeroPessoaCandidataJaUtilizado() {
    System.out.println("Número pessoa candidata já utilizado! \n");
  }
  
  /**Método que imprime, no console, a mensagem que o cpf da pessoa eleitora já está cadastrado. */
  public static void cpfPessoaEleitoraJaCadastrado() {
    System.out.println("Pessoa eleitora já cadastrada! \n");
  }
  
  /**Método que imprime, no console, a mensagem que a pessoa eleitora já votou. */
  public static void pessoaEleitoraJaVotou() {
    System.out.println("Pessoa eleitora já votou! \n");
  }
  
  /**Método que imprime, no console, a mensagem
   * que é preciso ter pelo menos um voto para mostrar o resultado. */
  public static void naoHaVotoComputado() {
    System.out.println("É preciso ter pelo menos um voto para mostrar o resultado \n");
  }
  
  /**Método que imprime, no console, a mensagem dos resultados da votação. */
  public static void resultadosVotacao(
      ArrayList<PessoaCandidata> pessoasCandidatas,
      double calcularPorcentagemVotos,
      int index
  ) {
    System.out.println(
              "Nome: " + pessoasCandidatas.get(index).getNome() + " - " 
              + pessoasCandidatas.get(index).getVotos() + " votos "
              + "( " + calcularPorcentagemVotos + "% )"
    );
  }
  
  /**Método que imprime, no console, a mensagem do total de votos. */
  public static void totalDeVotos(int totalVotos) {
    System.out.println("Total de votos: " + totalVotos + "\n");
  }
}
