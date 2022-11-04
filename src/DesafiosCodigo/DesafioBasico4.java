package DesafiosCodigo;
import java.util.Scanner;

//Desafio corresponde FizzBuzz
public class DesafioBasico4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        boolean multiplo3 = num % 3 == 0;
        boolean multiplo5 = num % 5 == 0;

        if (multiplo3 && multiplo5) {
            System.out.println("FizzBuzz");
        } else if (multiplo3) {
            System.out.println("Fizz");
        } else if (multiplo5) {
            System.out.println("Buzz");
        }else
            System.out.println(num);
    }
}