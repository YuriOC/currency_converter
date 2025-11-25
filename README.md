# Currency Converter

O **Currency Converter** é uma aplicação de linha de comando (CLI) desenvolvida em **Java**. Ele foi criado para fornecer uma ferramenta simples e eficiente para converter valores monetários entre diferentes moedas, utilizando **taxas de câmbio atualizadas** obtidas de uma API externa.

### Principais Funcionalidades

* **Conversão de Moedas:** Converte um valor especificado de uma moeda de origem para uma moeda de destino.
* **Taxas em Tempo Real:** Integração com uma API externa para garantir que as taxas de câmbio estejam sempre precisas.
* **Interface Simples:** Opera via terminal, focando na funcionalidade e facilidade de uso para conversões rápidas.

---

## Tecnologias Utilizadas

* **Linguagem:** Java
* **Comunicação Externa:** Biblioteca HTTP Client (para consumo da API)
* **Processamento de Dados:** **Google Gson**
    * Utilizado para a serialização e desserialização de objetos Java para JSON e vice-versa, facilitando a leitura das taxas de câmbio da API.

---

## Como Executar o Projeto

Para rodar o **Currency Converter** em sua máquina local, siga os passos abaixo:

### Pré-requisitos

1.  **Java Development Kit (JDK):** Versão 17 ou superior.
2.  **Chave de API:** Uma chave válida da API de taxas de câmbio utilizada pelo projeto (certifique-se de configurar esta chave no código, onde estiver escrito API_KEY).
3.  **Biblioteca Google Gson:** Necessária para o processamento das respostas JSON da API.

### Passos de Execução

1.  **Clonar o Repositório:**
    ```bash
    git clone https://github.com/YuriOC/currency_converter.git
    cd currency_converter
    ```

2.  **Compilar o Projeto:**
    ```bash
    javac -d out $(find src -name "*.java")
    ```

3.  **Executar a Aplicação:**
    ```bash
    java -cp out com.currency_converter.classes.Main.main
    ```


### Uso

A aplicação irá solicitar as informações de conversão no terminal:

1.  Digite o código da moeda de **Origem** (Ex: `USD`).
2.  Digite o código da moeda de **Destino** (Ex: `BRL`).
3.  Digite o **Valor** a ser convertido (Ex: `100.00`).
4.  O resultado da conversão será exibido na tela.

---

## Conceitos Aplicados

- Programação Orientada a Objetos (POO): Uso de classes, encapsulamento e métodos para estruturar o conversor de moedas de forma modular.

- Conexão e Comunicação com API Externa: Estabelecimento de conexão HTTP (usando java.net.http ou similar) para buscar as taxas de câmbio em tempo real de um serviço de terceiros.

- Manipulação de JSON: Utilização da biblioteca Google Gson para desserializar (ler) dados JSON complexos da API, convertendo-os em objetos Java para manipulação.

- Tratamento de Exceções: Implementação de try-catch para lidar com falhas de rede/conexão, dados inválidos ou erros de parsing JSON, garantindo a robustez do aplicativo.

- Estruturas de Controle: Uso de comandos condicionais (if/else) e de repetição (while ou loops) para o fluxo do programa e interação com o usuário no CLI.

- Entrada e Saída (I/O): Leitura de dados inseridos pelo usuário no console (CLI) e exibição dos resultados da conversão.

---

## Contribuições

Contribuições são bem-vindas! Se você tem sugestões de melhoria (como adicionar novos recursos, refatorar o código ou melhorar a interface CLI), sinta-se à vontade para:

1.  Fazer um **Fork** do projeto.
2.  Criar uma nova branch (`git checkout -b feature/sua-melhoria`).
3.  Fazer seus commits (`git commit -m 'feat: Adiciona melhoria X'`).
4.  Abrir um **Pull Request**.

---

## Autor

**YuriOC**

* [Perfil no GitHub](https://github.com/YuriOC)
