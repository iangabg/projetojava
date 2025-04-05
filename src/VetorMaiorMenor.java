import java.util.Scanner;

public class VetorMaiorMenor {
    public static void main(String[] args) {

        int[] vetor = {10, 5, 8, 2, 15, 7};

        int maior = vetor[0];
        int menor = vetor[0];
        int soma = 0;

        for (int numero : vetor){
            if (numero > maior){
                maior = numero;
            }

            if (numero < menor){
                menor = numero;

            }

            soma += numero;
        }

        double media = (double) soma / vetor.length;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);
    }
}
