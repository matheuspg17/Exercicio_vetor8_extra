
import java.util.Scanner;

public class Exercicio_vetor8_extra {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N = 100;
        String[] nomes = new String[N];
        int[] idades = new int[N];
        int menu, menu1;
        int qtde = 0;

        do {
            System.out.println("---Escola modelo---\n"
                    + "1- Cadastrar Aluno\n"
                    + "2- Listar Alunos\n"
                    + "3- Consultar Aluno\n"
                    + "4- Excluir Aluno\n"
                    + "5- Alterar dados do aluno\n"
                    + "0- Sair");
            System.out.print("Digite a opção desejada: ");
            menu = leia.nextInt();
            leia.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("---Cadastrar Aluno---");
                    if (qtde >= N) { //validação caso ja tenha 100 alunos cadastrados
                        System.out.println("---Limite de alunos cadastrados esgotado---");
                    }
                    System.out.println("digite o nome do aluno: ");
                    nomes[qtde] = leia.nextLine();
                    System.out.println("digite a idade do aluno: ");
                    idades[qtde] = leia.nextInt();
                    leia.nextLine();
                    qtde++;
                    break;
                case 2:{
                    do {
                    System.out.println("---Listas Alunos---\n"
                            + "1-Por Nome\n"
                            + "2-Por idade\n"
                            + "0-Sair");
                    System.out.println("Digite a opção desejada: ");
                    menu1 = leia.nextInt();
                    leia.nextLine();
                    switch(menu1){
                        case 1:
                            System.out.println("---Lista por nomes---");
                            for (int i = 0; i < qtde; i++){
                                System.out.println("Nome: " + nomes[i]);
                            }
                            break;
                        case 2:
                            System.out.println("---Lista por idade---");
                            for (int i = 0; i < qtde; i++){
                                System.out.println("idade: " + idades[i]);
                            }
                            break;
                        case 0:
                            System.out.println("Voltando ao menu inicial...");
                            
                    }
                    }while(menu1 != 0);    
                }break;
                case 3:
                    System.out.println("---Consultar Aluno---");
                    break;
                case 4:
                    System.out.println("---Excluir aluno");
                    break;
                case 5:
                    System.out.println("---Alterar Dados do Aluno---");
                    break;
                case 0:
                    System.out.println("Saindo do Programa...");
                    menu = 0;
            }

        } while (menu != 0);
    }
}
