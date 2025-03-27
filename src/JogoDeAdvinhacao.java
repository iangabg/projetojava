import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int palpite = 0;

        System.out.println("Vamos tentar adivinhar um número de 1 a 100.");

        while (palpite != numeroSecreto) {
            System.out.println("Digite seu  palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("Um pouco mais!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Um pouco menos!");
            } else {
                System.out.println("Finalmente!!");
            }
        }

        scanner.close();
    }
}
