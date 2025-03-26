import java.util.Scanner;

public class CadastroAtleta {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);
        String resposta;

        int limiteAtletas = 10;
        int contadorAtletas = 0;

        String[] nomesAtletas = new String[limiteAtletas];

        while (true) {

            System.out.println("\n*** MENU ***");
            System.out.println("1 - Cadastre um atleta");
            System.out.println("2 - Ver lista de cadastrados");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção (1, 2 ou 3): ");
            int escolha = cadastro.nextInt();
            cadastro.nextLine();

            if (escolha == 1) {

                if (contadorAtletas < limiteAtletas) {
                    System.out.println("Digite o nome do(a) atleta: ");
                    String nome = cadastro.nextLine();

                    System.out.println("Digite a idade do(a) atleta: ");
                    int age = cadastro.nextInt();

                    String categoria;
                    if (age < 5) {
                        categoria = "Idade inválida";
                    } else if (age >= 5 && age <= 10) {
                        categoria = "Infantil";
                    } else if (age >= 11 && age <= 15) {
                        categoria = "Juvenil";
                    } else if (age >= 16 && age <= 20) {
                        categoria = "Júnior";
                    } else if (age >= 21 && age <= 40) {
                        categoria = "Adulto";
                    } else {
                        categoria = "Master";
                    }

                    System.out.println("\nAtleta Cadastrado!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + age + " anos");
                    System.out.println("Categoria: " + categoria);
                    System.out.println("-------------------------");

                    nomesAtletas[contadorAtletas] = nome;
                    contadorAtletas++;
                } else {
                    System.out.println("Limite de 10 atletas atingido. Não é possível cadastrar mais.");
                }
            } else if (escolha == 2) {


                if (contadorAtletas > 0) {
                    System.out.println("\nLista de atletas cadastrados:");
                    for (int i = 0; i < contadorAtletas; i++) {
                        System.out.println(nomesAtletas[i]);
                    }
                } else {
                    System.out.println("Nenhum atleta cadastrado");
                }
            } else if (escolha == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
            }
        }

        cadastro.close();
    }
}
