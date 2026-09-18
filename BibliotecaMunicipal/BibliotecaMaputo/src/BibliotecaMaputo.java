import java.util.Scanner;

public class BibliotecaMaputo {

    // Limites máximos do sistema

    static final int MAX_LIVROS = 50;
    static final int MAX_LEITORES = 50;
    static final int MAX_EMPRESTIMOS = 100;

    // Vectores para armazenar os livros em IDS, Titulo, Autor, Ano de publicacao e Quantidade de livros

    static int[] idLivros = new int[MAX_LIVROS];
    static String[] titulolivro = new String[MAX_LIVROS];
    static String[] autorlivro = new String[MAX_LEITORES];
    static int[] anopublicacao = new int[MAX_LIVROS];
    static int[] quantidade = new int[MAX_LIVROS];
    static int[] totalemprestimos = new int[MAX_LIVROS];

    // Vectores para armazenar os Leitores

    static int[] idLeitores = new int[MAX_LEITORES];
    static String[] nomeLeitores = new String[MAX_LEITORES];

    // Matriz para armazenar o histórico de empréstimos
    // Cada linha representa:
    // [0] = ID do livro
    // [1] = ID do Leitor
    // [2] = Estado (1 = emprestado, 0 = devolvido)

    static int[][] historicoEmprestimos = new int[MAX_EMPRESTIMOS][3];

    // Contadores

    static int totalLivros = 0;
    static int totalLeitores = 0;
    static int totalEmprestimos = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            mostrarMenu();
            System.out.println("Escolhe uma das seguintes opcoes ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    regitrarLivro();
                    break;
                case 2:
                    catalogoLivro();
                    break;
                case 3:
                    pesquisarLivros();
                    break;
                case 4:
                    registroUsuario();
                    break;
                case 5:
                    listarUsuarios();
                    break;
                case 6:
                    realizarEmprestimos();
                    break;
                case 7:
                    devolucaoLivro();
                    break;
                case 8:
                    estatisticasLivro();
                    break;
                case 0:
                    System.out.println("Sair do Sistema");
                default:
                    System.out.println("Opcao Invalida : Tente Novamente");


            }


        }while(opcao!=0);
    }

    // DESENVOLVIMENTO DE FUNCOES QUE SERVIRAO DE MENU PARA O UTILIZADOR DO SISTEMA DE BIBLIOTECA

    public static void mostrarMenu() {
        System.out.println("****************************************");
        System.out.println("Biblioteca Municipal de Maputo");
        System.out.println("*****************************************");
        System.out.println("Seja bem vindo ao portal da Biblioteca");
        System.out.println("*****************************************");
        System.out.println("1. Registro do livro");
        System.out.println("2. Catalago de livro");
        System.out.println("3. Pesquisar  livros");
        System.out.println("4. Registrar Leitores ");
        System.out.println("5. Listar os Leitores");
        System.out.println("6. Realizar emprestimos");
        System.out.println("7. Devolucao do livro");
        System.out.println("8. Estatisticas");
        System.out.println("0. Sair");
    }

    //1-Funcao para registrar livros no Sistema da  Biblioteca

    public static void regitrarLivro() {
        Scanner scanner = new Scanner(System.in);
        if (totalLivros >= MAX_LIVROS) {

            System.out.println("Atingiu limite maximo de inscricoes");
        }
        System.out.println("********************************************");
        System.out.println("Registro de Livros");
        System.out.println("*********************************************");
        int id = totalLivros + 1;
        System.out.println("O ID do livro e :" + id);
        System.out.println("Digite o Titulo do Livro");
        String titulo = scanner.nextLine();
        System.out.println("Autor");
        String autor = scanner.nextLine();
        System.out.println("Ano de Publicacao");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Quantidade ");
        int quantidadelivro = scanner.nextInt();
        scanner.nextLine();
        if (quantidadelivro < 0) {
            System.out.println(" A quantidade do livro nao pode ser negativa");

        }

        idLivros[totalLivros]= id;
        titulolivro[totalLivros] = titulo;
        autorlivro[totalLivros]=autor;
        anopublicacao[totalLivros]=ano;
        quantidade[totalLivros]=quantidadelivro;
        totalemprestimos[totalLivros]=0; // Inicia a contagem de emprestimos

        System.out.println("ID do livro: "+ id);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicacao: "+ ano);
        System.out.println("Quantidade: "+ quantidadelivro);

        totalLivros++;

        System.out.println("O Livro o com ID " + id + "foi registrado com sucesso");


    }

    // 2-Lista dos Livros no Sistema
    public static void catalogoLivro() {

        System.out.println("********************************************");
        System.out.println("Lista de Livros");
        System.out.println("*********************************************");
        if (totalLivros == 0) {
            System.out.println("Nao ha registro de livros na biblioteca");
        }
        for (int i = 0; i < totalLivros; i++) {
            System.out.println("ID" + idLivros[i]);
            System.out.println("Titulo" + titulolivro[i]);
            System.out.println("Autor" + autorlivro[i]);
            System.out.println("Ano de Publicacao" + anopublicacao[i]);
            System.out.println("Quantidade disponivel" + quantidade);
            System.out.println("Total de emprestimos" + totalemprestimos);


        }
    }

    // 3- Pesquisa de Livros no Sistema da Biblioteca

    public static void pesquisarLivros() {
        Scanner scanner = new Scanner(System.in);

        if (totalLivros == 0) {
            System.out.println("Nao ha registro de livros na biblioteca");
        } else if (totalLivros>0) {
            System.out.println("Pesquisa de Livros");
            System.out.println("1. Pesquisar por titulo");
            System.out.println("2. Pesquisar por autor");
            int escolhaopcao = scanner.nextInt();
            switch (escolhaopcao) {
                case 1:
                    System.out.print("Introduza o termo de pesquisa: ");
                    String termo1 = scanner.nextLine();
                    boolean encontrado1 = false;
                    for (int i = 0; i < totalLivros; i++) {
                        boolean corresponde1 = false;
                        if (escolhaopcao == 1) {
                            corresponde1 = titulolivro[i].contains(termo1);
                            if (corresponde1){
                                System.out.println("ID do livro:"+ idLivros[i]);
                                System.out.println("Titulo do livro:"+ idLivros[i]);
                                System.out.println("Autor do livro:"+ titulolivro[i]);
                                System.out.println("Ano de Publicacao:"+ anopublicacao[i]);
                                System.out.println("Quantidade Disponivel:"+quantidade[i]);
                                encontrado1 = true;
                            }
                        }
                    }
                    if (!encontrado1){
                        System.out.println("Nenhum livro encontrado");
                    }
                    break;
                case 2:
                    System.out.print("Introduza o nome do autor que pesquisa: ");
                    String termo2 = scanner.nextLine();
                    boolean encontrado2 = false;
                    for (int i = 0; i < totalLivros; i++) {
                        boolean corresponde2 = false;
                        if (escolhaopcao == 2) {
                            corresponde2 = autorlivro[i].contains(termo2);
                            if (corresponde2){
                                System.out.println("ID do livro:"+ idLivros[i]);
                                System.out.println("Titulo do livro:"+ idLivros[i]);
                                System.out.println("Autor do livro:"+ titulolivro[i]);
                                System.out.println("Ano de Publicacao:"+ anopublicacao[i]);
                                System.out.println("Quantidade Disponivel:"+quantidade[i]);
                                encontrado2 = true;
                            }
                        }
                    }
                    if (!encontrado2){
                        System.out.println("Nenhum livro encontrado");
                    }
                    break;
                default:
                    System.out.println(" Escolha Invalida, tente novamente");
        }


        }


    }

    // 4-Registro de Usuario

    public static void registroUsuario(){
        Scanner scanner = new Scanner(System.in);
        if(totalLeitores>=MAX_LEITORES){
            System.out.println("Limite maximo de leitores atingido");
        }
        System.out.println("Registro de Leitores");
        int idusuario = totalLeitores+1;

        System.out.println("Nome do Usuario");
        String nome = scanner.nextLine();
        System.out.println("O ID do(a) "+ nome+ " e :"+ idusuario);

        idLeitores[totalLeitores]=idusuario;
        nomeLeitores[totalLeitores]=nome;

        System.out.println("ID do Usuario: "+ idusuario);
        System.out.println("Nome do Usuario: "+ nome);
        totalLeitores++;
        System.out.println("Usuario registrado com sucesso");
    }
    
    //5- Lista de Usuarios do Sistema da Biblioteca Municipal
    public static void listarUsuarios(){
        System.out.println("Lista de Usuarios");
        if (totalLeitores == 0){
            System.out.println("Nao existem usuarios registrados");
        }
       for (int i =0; i< totalLeitores; i++){
           System.out.println("ID do Usuario: "+ idLeitores[i]);
           System.out.println("Nome do Usuario: "+ nomeLeitores[i]);
       }
    }

   //6- Realizar Emprestimos do livros da Biblioteca

    public static void realizarEmprestimos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Emprestimo de Livro");
        if(totalLivros == 0){
            System.out.println("Nao ha registro de livros na Biblioteca");
        }
        if(totalLeitores ==0){
            System.out.println(" Nao ha registro de Usuarios no Sistema");

        }
        if(totalEmprestimos>= MAX_EMPRESTIMOS){
            System.out.println("O historico de empresticos esta cheio");
        }

        System.out.println("Digite o ID do livro que pretende requisitar");
        int idlivro = scanner.nextInt();
        int indicelivro = idlivro-1;
        if(indicelivro<0 || indicelivro>=totalLivros){
            System.out.println("Erro: Livro nao encontrado");
        }

         if(quantidade[indicelivro]<=0){
             System.out.println("Erro: Nao existem exemplares de livros para emprestimo");

         }

        System.out.println("ID do Usuario");
         int idusuario = scanner.nextInt();
         int indiceusuario = idusuario-1;

         if(indiceusuario<0 || indiceusuario>=totalLeitores){
             System.out.println("Erro: Usuario nao encontrado");
         }

         // Registrar Emprestimo dos livros
         historicoEmprestimos[totalEmprestimos][0]=idlivro;
         historicoEmprestimos[totalEmprestimos][1]=idusuario;
         historicoEmprestimos[totalEmprestimos][2] =1;// O numero 1 denota que o emprestimo do livro esta ativado

    }

    // 7- Devolucao do livro da Biblioteca

    public static void devolucaoLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do livro que pretende devolver");
        int id = scanner.nextInt();
        System.out.println("Digite o ID do Usuario");
        int idusuario = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < totalEmprestimos; i++) {
            if (historicoEmprestimos[i][0] == id && historicoEmprestimos[i][1] == idusuario && historicoEmprestimos[i][2] == 1) {
                historicoEmprestimos[i][2] = 0; // Denota que o livro foi devolvido
                quantidade[id - 1]++; // Indica a devolucao do livro, ou seja, o acrescimo de estoque
                encontrado = true;
                System.out.println("Devolucao registrada com sucesso");
                break;

            }
            if (!encontrado) {
                System.out.println("Erro: Nenhum emprestimo ativo encontrado com esses dados");
            }
        }

    }
      // Estatisticas para determinar o livro mais requisitado na Biblioteca
        public static void estatisticasLivro(){

        if(totalLivros==0){
            System.out.println("Nao ha registro de livros para Estatistica");
        }

        int totalrequisitados =0;
        int indicemaisemprestado=0;
        int mairquantidade =-1;
        for(int i =0; i<totalLivros;i++){
            totalrequisitados+= totalemprestimos[i];
            if (totalemprestimos[i]>mairquantidade){
                mairquantidade = totalemprestimos[i];
                indicemaisemprestado =i;

            }
        }
            System.out.println("O total de emprestimos efetuados e: "+ totalrequisitados);
        if (mairquantidade>0){
            System.out.println("Livro mais emprestado:"+ titulolivro[indicemaisemprestado] + "(Requisitado"+ mairquantidade+ "vezes)" );

        } else {
            System.out.println("Nenhum livro foi emprestado ate ao momento");
        }

    }



}







