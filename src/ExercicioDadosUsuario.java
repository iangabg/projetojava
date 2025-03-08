import java.util.Scanner;

public class ExercicioDadosUsuario {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String nome;
            int idade, tempoIdade;
            Double altura, alturaCalc;

            System.out.println("Qual o seu nome? ");
            nome = scanner.nextLine();

            System.out.println("Qual sua idade? ");
            idade = scanner.nextInt();

            System.out.println("Qual sua altura? ");
            altura = scanner.nextDouble();

            System.out.println("Olá " + nome + "!");

            tempoIdade = 50 - idade;
            System.out.println("Em " + tempoIdade + " você terá 50 anos!" );

            alturaCalc = altura * 100;
            System.out.println("Seu tamanho é de " + alturaCalc + ".");

            scanner.close();

        }
    }


