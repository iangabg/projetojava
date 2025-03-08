import java.util.Scanner;

public class VeriificarIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Qual seu nome? ");
        name = scanner.nextLine();

        System.out.println("Qual sua idade? ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Você tem CNH? (sim/não) ");
        String resposta = scanner.nextLine();

        boolean temCNH = resposta.equals("sim");


        scanner.close();

        if (age >= 18 && temCNH){
            System.out.println("Muito bem, " + name + ". Você pode andar tranquilo!");
        } else if (!temCNH) {
            System.out.println("Você não pode dirigir porque não tem CNH!");
        } else {
            System.out.println("Desculpe, " + name + ". Você não é maior de idade.");
        }

    }
}
