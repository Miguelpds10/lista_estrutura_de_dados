---

## 🚀 Estrutura do Projeto

O projeto é composto por classes principais de estruturas de dados e suas respectivas classes de teste:

**`NossoVetor`**: Implementação de um vetor dinâmico com controle de capacidade, crescimento e encolhimento automático, além de métodos de busca (`contem`, `quantidade`), estatísticas (`maior`, `menor`, `soma`, `media`) e tratamento de remoção.
**`Pilha`**: Implementação de uma Pilha (Stack) baseada em vetor, contendo operações de empilhar, desempilhar, espiar o topo, esvaziar e algoritmos práticos como o verificador de palíndromos.
**`Recursao`**: Conjunto de métodos estáticos recursivos (como fatorial, soma até $n$, contagem e soma de dígitos, potência e fibonacci), acompanhados de análises de desempenho, contagem de chamadas e limites de capacidade dos tipos `int` e `long`.

---

## 🛠️ Como Executar o Projeto no VS Code

Como este projeto foi desenvolvido utilizando o **Visual Studio Code**, siga os passos abaixo para compilar e executar os códigos pelo terminal integrado:

### Pré-requisitos
* Ter o **Java Development Kit (JDK)** instalado e configurado no seu sistema.
* Ter a extensão **Extension Pack for Java** instalada no seu VS Code (recomendado para facilitar a navegação).

### Passos para Compilação e Execução:

1. Abra a pasta do projeto no **VS Code**.
2. Abra o terminal integrado (`Ctrl + ~` no Windows/Linux ou `Ctrl + `` no macOS).
3. Compile todos os arquivos `.java` da pasta de uma só vez executando:
   ```bash
   javac *.java

   ## 📋 Conteúdo da Lista de Exercícios

- **Seção 1: Nosso Vetor**
  - Análise de comportamento, capacidade e ocupação.
  - Implementação de novos métodos de busca e operações matemáticas (`maior`, `menor`, `soma`, `média`).
  - Tratamento de exceções e refatoração do método `remove`.
- **Seção 2: Pilha**
  - Previsões de saída e testes de mesa.
  - Implementação de métodos auxiliares (`espia` e `esvazia`).
  - Resolução do problema de **Palíndromos** utilizando pilhas.
  - Proteção contra erros de estouro (*Overflow* e *Underflow*).
- **Seção 3: Recursão**
  - Identificação de casos base e passos recursivos.
  - Implementação de funções matemáticas recursivas.
  - Análise de árvore de chamadas (ex: Fibonacci) e observação dos limites de estouro para os tipos primitivos `int` e `long`.

---

## 👨‍💻 Autor
**Miguel Pinto da Silva** - (https://github.com/Miguelpds10/) - Desenvolvimento do projeto e resoluções dos exercícios.
**Isabela de Oliveira Alves** - (https://github.com/IsabelaCSS) -  Desenvolvimento do projeto e resoluções dos exercícios.
Desenvolvido como parte das atividades práticas da disciplina de **Estrutura de Dados**.
