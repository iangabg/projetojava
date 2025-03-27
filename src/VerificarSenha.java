import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senha;

        do {
            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();

            if (!senha.equals("Java21")) {
                System.out.println("Senha incorreta. Tente novamente");
            }
        } while (!senha.equals("Java21"));

        System.out.println("Acesso permitido!");
        scanner.close();
    }
}
