package DesafiosCodigo;
import java.util.Scanner;

//Desafio corresponde ao São Iguais?
public class DesafioBasico1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A == B)
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");
    }

}
