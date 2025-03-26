import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class AvaliarNota {
    public static void main(String[] args) {

        int notaAluno;
        Scanner nota = new Scanner(System.in);

        System.out.println("Digite sua nota (1-10): ");
        notaAluno = nota.nextInt();

        switch(notaAluno) {
            case 10, 9:
                System.out.println("Excelente!");
                break;

            case 8, 7:
                System.out.println("Bom");

            case 6, 5:
                System.out.println("Regular");

            default:
                System.out.println("Reprovado!");
                break;
            //if(notaAluno < 5) {
            //}
        }





        nota.close();
    }
}
