# language: pt

  @Login
  Funcionalidade: Login do site TaskIt
    Cenario: Fluxo Principal

    Esquema do Cenario:
      Dado que o usuario esta no site TaskIt e clica no botao Sign in
      Quando ele preenche os campos <login> e <senha> com dados validos
      E clcia no botao SIGN IN
      Entao o usuario deve ver o <resultado>

        Exemplos:

        | login             | senha          | resultado                |
        | "Wolverine"       | "1890"         | "Hi, Logan"              |
        | "Ciclope"         | "2022"         | "Hi, Scott Summers"      |
        | "Fenix"           | "1237"         | "Hi, Jean Grey"          |
        | "Professor X"     | "3221"         | "Hi, Charles Xavier"     |
        | "Fera"            | "5000"         | "Hi, Hank McCoy"         |
        | "Tempestade"      | "0829"         | "Hi, Ororo Munroe"       |
        | "Noturno"         | "6648"         | "Hi, Kurt Wagner"        |