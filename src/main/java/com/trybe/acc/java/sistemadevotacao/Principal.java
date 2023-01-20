package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**Classe Principal. */
public class Principal {

  /**Método main da Classe Principal. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    
    boolean mostraOpcoesMenu1 = true;
    boolean mostraOpcoesMenu2 = true;
    boolean mostraOpcoesMenu3 = true;
    
    while (mostraOpcoesMenu1 == true) {
      Mensagens.menuCadastrarPessoaCanditada();
      String opcaoDesejadaPessoaCandidata = scanner.next();
      
      switch (opcaoDesejadaPessoaCandidata) {
        case "1":
          Mensagens.entrarComNomePessoaCandidata();
          String nomePessoaCandidata = scanner.next();

          Mensagens.entrarComNumeroPessoaCandidata();
          String numeroPessoaCandidata = scanner.next();

          Mensagens.pessoaCandidataCadastradaComSucesso();
          
          gerenciamentoVotacao.cadastrarPessoaCandidata(
              nomePessoaCandidata, Integer.parseInt(numeroPessoaCandidata));
          break;

        case "2":
          while (mostraOpcoesMenu2 == true) {
            Mensagens.menuCadastrarPessoaEleitora();
            String opcaoDesejadaPessoaEleitora = scanner.next();
            
            switch (opcaoDesejadaPessoaEleitora) {
              case "1":
                Mensagens.entrarComNomePessoaEleitora();
                String nomePessoaEleitora = scanner.next();

                Mensagens.entrarComCpfPessoaEleitora();
                String cpfPessoaEleitora = scanner.next();

                Mensagens.pessoaEleitoraCadastradaComSucesso();

                gerenciamentoVotacao.cadastrarPessoaEleitora(nomePessoaEleitora, cpfPessoaEleitora);
                break;

              case "2":
                while (mostraOpcoesMenu3 == true) {
                  Mensagens.menuDeVotacao();
                  String opcaoDesejadaMenuVotacao = scanner.next();
                  
                  switch (opcaoDesejadaMenuVotacao) {
                    case "1":
                      Mensagens.entrarComCpfPessoaEleitora();
                      String cpfPessoaEleitoraVotacao = scanner.next();
                      
                      Mensagens.entrarComNumeroPessoaCandidata();
                      String numeroPessoaCandidataVotacao = scanner.next();
                      
                      gerenciamentoVotacao.votar(
                          cpfPessoaEleitoraVotacao, Integer.parseInt(numeroPessoaCandidataVotacao));
                      break;

                    case "2": gerenciamentoVotacao.mostrarResultado();
                      break;

                    case "3": gerenciamentoVotacao.mostrarResultado();
                 
                      mostraOpcoesMenu3 = false;
                      break;

                    default:
                  }
                }
                mostraOpcoesMenu2 = false;
                break;
              default:
            }
          }
          mostraOpcoesMenu1 = false;
          break;

        default:
      }
    }

    scanner.close();
  }

}
