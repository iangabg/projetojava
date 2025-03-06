import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);




        while (true) {
            int number;
            System.out.println("Digite um número (ou 0 para sair): ");
            number = read.nextInt();

            if (number == 0) {
                System.out.println("Encerrando programa...");
                break;
            }

            if (number % 2 != 0){
                System.out.println("Este número é impar!!");
            } else {
                System.out.println("Este número é par!!");
            }
        }
    }
}