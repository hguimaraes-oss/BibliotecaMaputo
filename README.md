# 📚 Sistema de Gestão de Biblioteca Municipal

Um sistema simples em linguagem **Java** baseado em consola, desenvolvido para automatizar e optimizar a gestão de inventário de livros, usuarios e operações de empréstimo/devolução na biblioteca digital da cidade de Maputo.

---

## 📌 Índice
- [Visão Geral](#-visão-geral)
- [Funcionalidades Principais](#-funcionalidades-principais)
- [Estrutura de Dados](#-estrutura-de-dados)
- [Pré-requisitos](#-pré-requisitos)
- [Instalação e Execução](#-instalação-e-execução)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Demonstração do Menu](#-demonstração-do-menu)
- [Licença](#-licença)

---
## 📖 Visão Geral


Com o crescimento exponencial do número de leitores, este projeto surge como uma solução eficiente para auxiliar os bibliotecários na administração diária do acervo bibliográfico e no controlo do histórico de requisições. O sistema opera totalmente via consola e utiliza uma base de dados simulada em memória recorrendo a vectores/arrays e matrizes.


---

## ⚙️ Funcionalidades Principais

* **📖 Registo de Livros:**
  * Inserção de novos títulos no catálogo com ID único, título, autor, ano de publicação e quantidade disponível.
* **🔍 Consulta de Catálogo:**
  * Listagem de todos os livros registados.
  * Pesquisa rápida de livros por título ou autor.
* **🔄 Gestão de Empréstimos e Devoluções:**
  * Empréstimo de livros a utilizadores registados com atualização automática do stock disponível.
  * Registo e processamento da devolução de obras.
* **📊 Estatísticas do Sistema:**
  * Identificação do livro mais emprestado.
  * Apresentação do número total de requisições efetuadas.
---

## 🗄️ Estrutura de Dados

Os dados introduzidos no sistema bibliotecario sao armazenados em vectores e matrizes.
* **Vetores (Arrays 1D):** Para armazenar dados de livros :IDs, títulos, autores, e quantidades de stock; dados de usuarios : IDs e nome de usuarios.
* **Matrizes (Arrays 2D):** Mapeamento do histórico de empréstimos e relação utilizador-livro.

---
## 🛠️ Pré-requisitos

Para compilar e executar este projeto, necessita de ter instalado no seu computador:
* **Java Development Kit (JDK):** Versão 18 ou superior.
* Um terminal / linha de comandos (ou uma IDE como Eclipse, IntelliJ IDEA ).

---
## 🚀 Instalação e Execução
**1. Clonar Repositorio**
'''bash
git clone https://github.com/hguimaraes-oss/BibliotecaMaputo.git

**2. Criar Pasta**
 cd BibliotecaMaputo

 **3. Compilacão do Projecto**
 '''bash
   javac BibliotecaMaputo.java
   
  **4. Execucão**
  java BibliotecaMaputo

  ---
  # 📂 Estrutura do Projeto 

  BibliotecaMunicipal/BibliotecaMaputo
│
├── src/
│   ├── Main.java
│   └── BibliotecaMaputo.java
│
├── README.md
└── .gitignore

---

# 🖥️ Demonstração do Menu
Ao iniciar a aplicação, ser-lhe-á apresentado um menu interativo semelhante a este:

****************************************
Biblioteca Municipal de Maputo
*****************************************
Seja bem vindo ao portal da Biblioteca
*****************************************
1. Registro do livro
2. Catalago de livro
3. Pesquisar  livros
4. Registrar Leitores 
5. Listar os Leitores
6. Realizar emprestimos
7. Devolucao do livro
8. Estatisticas
   
0 Sair
   
Escolhe uma das seguintes opcoes

---

# 🧪 Exemplo de Utilização
**Registo de um livro**
********************************************
Registro de Livros
*********************************************
O ID do livro e :1
Digite o Titulo do Livro
Os Lusiadas
Autor
Luis Vaz de Camoes
Ano de Publicacao
1572
Quantidade 
5
ID do livro: 1
Titulo: Os Lusiadas
Autor: Luis Vaz de Camoes 
Ano de publicacao: 1572
Quantidade: 5
O Livro o com ID 1 foi registrado com sucesso

**Registro de Leitores**

Nome do Usuario
Helena Milena
O ID do(a) Milena Smith e :1
ID do Usuario: 1
Nome do Usuario: Helena Milena 
Usuario com o nome Helena Milena e ID 1 foi registrado com sucesso

**Pesquisa de Livros**
Escolhe uma das seguintes opcoes 
3
Pesquisa de Livros
Digite o termo de pesquisa (Título ou Autor): Tipler
ID: 2
Titulo do livro: Fisica para Cientistas e Engenheiros
Autor: Paul Tipler 
Ano de Publicacao: 2009
Quantidade: 10

Escolhe uma das seguintes opcoes 
3
Pesquisa de Livros
Digite o termo de pesquisa (Título ou Autor): Lusiadas
ID: 1
Titulo do livro: Os Lusiadas
Autor: Luis Vaz de Camoes 
Ano de Publicacao: 1572
Quantidade: 5


**Emprestimos**
Escolhe uma das seguintes opcoes 
6
Emprestimo de Livro
Digite o ID do livro que pretende requisitar
1
ID do Usuario
1
Detalhes do livro
ID: 1
Titulo do livro: Os Lusiadas
Nome do autor: Luis Vaz de Camoes 
Ano de publicacao: 1572
A quantidade de livro remanescente e: 4
**************************************************
Emprestimo efetuado com sucesso para: Helena Milena!


---

# 📌 Dependências
O projeto não necessita de bibliotecas externas.

A única dependência necessária para executar o programa é:

Java Development Kit (JDK) 18+

---

# 📄 Licença

Este projeto foi desenvolvido para fins académicos e educacionais.





  
 
 

<h1 align="center">Ola 👋, Eu sou a Helena Milena Guimaraes</h1>
<h3 align="center">Estudante de Engenharia Informatica na UnISCED</h3>

- 🔭 Desenvolvi uma programa com a linguagem de programacao em JAVA **Sistema de Biblioteca Digital : Biblioteca Maputo**

<h3 align="left">Connect with me:</h3>
<p align="left">
</p>

<h3 align="left">Languages and Tools:</h3>
<p align="left"> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> </p>
