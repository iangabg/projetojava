import java.util.Scanner;
import java.util.StringJoiner;

public class CategoriaAtleta {
    public static void main(String[] args) {

        int age;
        String categoria;
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        age = idade.nextInt();

        if (age < 5){
            categoria = "Categoria inválida pra competir!";
        } else if (age >= 5 && age <= 10) {
            categoria = "Infantil";
        } else if (age >= 11 && age <= 15) {
            categoria = "Juvenil";
        } else if (age >= 16 && age <= 19) {
            categoria = "Júnior";
        } else if (age >= 20 && age <= 40){
            categoria = "Adulto";
        } else {
            categoria = "Master";
        }

        System.out.println(categoria);

        idade.close();
    }
}
