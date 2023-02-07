# Sistema de Votação

    Este projeto foi realizado com o objetivo de aprimorar o conhecimento na linguagem Java.

## :zap: Descrição
   Desenvolvi um sistema de votação eletrônico. 
   
   A ideia é que esse sistema permita o cadastro das pessoas candidatas, o cadastro das pessoas eleitoras, a realização do processo de votação e a consulta do resultado tanto parcial quanto final da votação.

  ### :memo: O fluxo do sistema é definido seguindo três etapas principais que serão executadas na seguinte ordem:
  1. **Cadastrar pessoas candidatas:**
  2. **Cadastrar pessoas eleitoras:**
  3. **Iniciar processo votação:**

  ### :pushpin: O menu do primeiro laço, **Cadastrar pessoas candidatas**, tem o seguinte formato:
  ```
        Cadastrar pessoa candidata?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
  ```
   * Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa candidata), será impressa no console, a mensagem:
     * `Entre com o nome da pessoa candidata:` 
   * Em seguida, depois de inserir o nome da pessoa candidata e pressionar enter, aparecerá no console a mensagem:
     * `Entre com o número da pessoa candidata:`
   * Depois que a pessoa usuária inserir o número da pessoa candidata, o sistema retornará ao estado inicial do menu.
   * Se a pessoa usuária entrar com a opção 2 do menu, irá parar o laço. O segundo laço, que representa a etapa de cadastro de pessoas eleitoras, será iniciado logo na sequência.

  ### :pushpin: O menu do segundo laço, **Cadastrar pessoas eleitoras**, tem o seguinte formato:
  ```
       Cadastrar pessoa eleitora?
       1 - Sim
       2 - Não
       Entre com o número correspondente à opção desejada:
  ```
   * Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa eleitora), então, será impressa no console, a mensagem:
     * `Entre com o nome da pessoa eleitora:`
   * Em seguida, depois de inserir o nome da pessoa eleitora e pressionar enter, aparecerá no console a mensagem:
     * `Entre com o cpf da pessoa eleitora:`
   * Depois que a pessoa usuária inserir o CPF da pessoa eleitora, o sistema retornará ao estado inicial do menu.
   * Se a pessoa usuária entrar com a opção 2 do menu, o laço terminará e iniciará o terceiro laço, marcando o início da votação.

  ### :pushpin: O menu do terceiro laço, **Iniciar processo votação**, tem o seguinte formato:
  ```
       Entre com o número correspondente à opção desejada:
       1 - Votar
       2 - Resultado Parcial
       3 - Finalizar Votação
  ```
   * Se a pessoa usuária entrar com o **valor 1** (que indica que ela quer computar um voto), será impressa no console, a mensagem: 
     * `Entre com o cpf da pessoa eleitora:` 
   * Em seguida, depois de inserir o CPF da pessoa eleitora e pressionar enter, aparecerá no console a mensagem:
     * `Entre com o número da pessoa candidata:`
   * Feito isso, o voto deve ser computado, e o sistema retorna ao estado inicial do menu.
     * Por outro lado, se a pessoa usuária entrar com o **valor 2** (que indica que ela quer visualizar o resultado parcial), será impresso no console o resultado parcial.
   * Esse ciclo se repete até que a pessoa usuária escolha o **valor 3** (Finalizar Votação). Quando a opção 3 for escolhida, o terceiro laço será terminado, imprimindo o resultado da votação, de forma similar ao resultado parcial, seguida da finalização do programa.
    
  ### :pushpin: A saída do **resultado parcial** e **resultado da votação**, tem o seguinte formato:
  ```
       Nome: Fulano - 1 votos ( 100.0% )
       Total de votos: 1
  ```


### :camera: A imagem abaixo mostra o fluxo que o programa seguiu:
![Fluxo-sistema-de-votacao](https://github.com/analuisams99/sistema-de-votacao/blob/main/img/sistema_votacao_dica.png)





## Instalação do projeto em sua máquina
  1. Clone o repositório
   
     `git@github.com:analuisams99/sistema-de-votacao.git`
    
  2. Entre no diretório do repositório que você acabou de clonar:
  
     `cd sistema-de-votacao`

  3. Instale as dependências:
    
     `mvn install`

## Para testar o projeto
  1. digite o comando no seu terminal
      
      `mvn test`
      
    Os códigos de testes, da pasta src/test/java/com/trybe/acc/java/sistemadevotacao, foram desenvolvidos pela Trybe.
    
---

-- Projeto desenvolvido por Ana Luisa Marques Simões, para fins didáticos. 2023
