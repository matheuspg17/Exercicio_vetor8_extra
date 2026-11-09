import java.util.Scanner;

public class Main {
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
                        System.out.println("---Limite de alunos cadastrados---");
                        break;
                    }
                    System.out.println("digite o nome do aluno: ");
                    nomes[qtde] = leia.nextLine();
                    System.out.println("digite a idade do aluno: ");
                    idades[qtde] = leia.nextInt();
                    leia.nextLine();
                    qtde++;
                    break;
                case 2:
                    System.out.println("---Lista de Alunos---");
                    for (int i = 0; i < qtde; i++) {
                        System.out.println((i + 1) + "-Nome: " + nomes[i] + " | idade: " + idades[i]);
                    }
                    break;
                case 3:
                    do {
                        System.out.println("---Consultar Aluno---\n"
                                + "1-Por nome\n"
                                + "2-Por idade\n"
                                + "0-Sair");
                        System.out.println("Digite a opção desejada: ");
                        menu1 = leia.nextInt();
                        leia.nextLine();
                        switch (menu1) {
                            case 1: {
                                System.out.println("---Consulta por nomes---");
                                String nomeprocurado;
                                boolean flag = false;
                                System.out.println("Digite o nome do(s) alunos(s): ");
                                nomeprocurado = leia.nextLine();
                                for (int i = 0; i < qtde; i++) {
                                    if (nomes[i].equalsIgnoreCase(nomeprocurado)) {
                                        flag = true;
                                        System.out.println((i + 1) + "-Nome: " + nomes[i] + " | Idade: " + idades[i]);
                                    }
                                }
                                if (flag == false) {
                                    System.out.println("Aluno(s) não encontrado(s)");
                                }
                            }
                            break;
                            case 2: {
                                System.out.println("---Consulta por idade---");
                                int idadeprocurada;
                                boolean flag = false;
                                System.out.println("Digite a idade do(s) alunos(s): ");
                                idadeprocurada = leia.nextInt();
                                leia.nextLine();
                                for (int i = 0; i < qtde; i++) {
                                    if (idades[i] == idadeprocurada) {
                                        flag = true;
                                        System.out.println((i + 1) + "-Nome: " + nomes[i] + " | Idade: " + idades[i]);
                                    }
                                }
                                if (flag == false) {
                                    System.out.println("Aluno(s) não encontrado(s)");
                                }
                            }
                            break;
                            case 0:
                                System.out.println("Voltando ao menu inicial...");
                                menu1 = 0;
                        }
                    } while (menu1 != 0);
                    break;
                case 4: {
                    boolean flag = false;
                    int confirma;
                    String nomeprocurado;
                    System.out.println("---Excluir aluno---");
                    System.out.println("Digite o nome do aluno: ");
                    nomeprocurado = leia.nextLine();
                    for (int i = 0; i < qtde; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeprocurado)) {
                            flag = true;
                            System.out.println("Deseja excluir aluno: " + nomes[i] + "| idade: " + idades[i] + "\n"
                                    + "1-sim\n"
                                    + "2-nao");
                            confirma = leia.nextInt();
                            leia.nextLine();
                            if (confirma == 1) {
                                for (int j = i; j < qtde - 1; j++) {
                                    nomes[j] = nomes[j + 1];
                                    idades[j] = idades[j + 1];
                                }
                                nomes[qtde - 1] = null;
                                idades[qtde - 1] = 0;
                                qtde--;
                                i--;
                                System.out.println("--Aluno excluido com sucesso--");
                            }
                        }
                    }
                }
                break;
                case 5:
                    boolean flag = false;
                    int confirma, confirma1, novaidade;
                    String nomeprocurado, novonome;
                    System.out.println("---Alterar Dados do Aluno---");
                    System.out.println("Digite o nome do aluno: ");
                    nomeprocurado = leia.nextLine();
                    for (int i = 0; i < qtde; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeprocurado)) {
                            flag = true;
                            System.out.println("Deseja alterar o nome do aluno? " + nomes[i] + "| idade: " + idades[i] + "\n"
                                    + "1-sim\n"
                                    + "2-nao");
                            confirma = leia.nextInt();
                            leia.nextLine();
                            if (confirma == 1) {
                                System.out.println("Novo nome do aluno: ");
                                novonome = leia.nextLine();
                                nomes[i] = novonome;
                            }
                            System.out.println("Deseja alterar a idade do aluno? " + nomes[i] + "| idade: " + idades[i] + "\n"
                                    + "1-sim\n"
                                    + "2-nao");
                            confirma1 = leia.nextInt();
                            leia.nextLine();
                            if (confirma1 == 1) {
                                System.out.println("Nova idade do aluno: ");
                                novaidade = leia.nextInt();
                                leia.nextLine();
                                idades[i] = novaidade;
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do Programa...");
                    menu = 0;
            }
        } while (menu != 0);
    }
}
