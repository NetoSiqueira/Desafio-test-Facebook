#language: pt

  Funcionalidade: Testar funcionalidade do Login do Facebook:
    1 - Acessar o login com sucesso
    2 - Acessar o login com email invalido
    3 - Acessar o login com senha invalida


  Contexto: Verificação se estou na tela de login no Facebook
    Dado que estou na pagina de login do facebook

    Cenario: Devo validar um login de sucesso no facebook
    Dado que insere um login valido
    E efetua o login
    Entao verifico a tela inicial

    Cenario: Devo validar um email invalido no facebook
      Dado que insere um email invalido
      E efetua o login
      Entao verifico a tela de erro email invalido

    Cenario: Devo validar uma senha invalida no facebook
      Dado que insere uma senha invalida
      E efetua o login
      Entao verifico a tela de erro senha invalida