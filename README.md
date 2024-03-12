# Projeto de Criptografia

## Introdução

Bem-vindo ao nosso projeto de criptografia! Este projeto Java foi desenvolvido para fornecer uma maneira simples, mas eficaz, de criptografar e descriptografar mensagens de texto utilizando uma abordagem de substituição de caracteres personalizada. Baseamos-se na técnica de substituição polialfabética onde cada índice do alfabeto será usado como chave para escolher a quantidade de caracteres do dicionário sujo, para fazer a substituição.

## Componentes do Projeto

O projeto é composto por duas principais classes Java:

- `Dicionary`: Responsável pelo mapeamento entre caracteres alfabéticos (maiúsculos e minúsculos) e uma sequência de caracteres especiais. Essa classe oferece métodos para obter a sequência de caracteres correspondente a uma letra específica, tanto em maiúsculo quanto em minúsculo.

- `CryptographyIMPL`: Implementa a interface `Cryptography`, proporcionando os métodos `encrypt` para criptografar uma mensagem de texto e `decrypt` para descriptografar uma mensagem de texto previamente criptografada. Essa classe utiliza a classe `Dicionary` para realizar as operações de criptografia e descriptografia.

## Funcionamento

### Criptografia

O processo de criptografia segue estes passos:

1. A mensagem de texto é dividida em palavras.
2. Cada letra das palavras é substituída pela sequência de caracteres correspondente no dicionário de criptografia.
3. Um número aleatório é adicionado após cada sequência de caracteres para aumentar a complexidade.
4. As palavras criptografadas são separadas por um delimitador específico.

### Descriptografia

O processo de descriptografia é o inverso da criptografia:

1. A mensagem criptografada é dividida utilizando o delimitador de palavras.
2. Cada sequência de caracteres criptografados é dividida com base nos números inseridos durante a criptografia.
3. As sequências de caracteres são comparadas com as do dicionário para encontrar a letra correspondente.
4. As letras são reunidas para formar o texto claro.

## Requisitos

Para executar este projeto, você precisará de:

- JDK 11 ou superior.
- Uma IDE Java ou um editor de texto para editar e compilar os arquivos.

## Como Usar

1. Clone ou baixe o projeto para o seu ambiente de desenvolvimento.
2. Abra o projeto na sua IDE ou editor de texto.
3. Para testar as funcionalidades de criptografia, compile e execute a classe MainEncripty. Quando solicitado, insira o texto claro que deseja criptografar. O programa exibirá o texto cifrado resultante. Para testar a descriptografia, compile e execute a classe MainDecrypt. Quando solicitado, insira o texto cifrado e o programa exibirá o texto claro correspondente. Continue inserindo textos conforme desejado, ou interrompa a execução do programa para encerrar.

## Conclusão

Este projeto de criptografia é uma ótima ferramenta para entender os conceitos básicos de criptografia e como a substituição de caracteres pode ser utilizada para proteger mensagens de texto.
