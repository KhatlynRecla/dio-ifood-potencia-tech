package DesafiosCodigo;
import java.util.Scanner;

//Desafio corresponde ao Somando múltiplos
public class DesafioBasico2 {
    public static void main(String[] args) {
        int A, N;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for(int i = 0; i <= N; i++){
            if(i % A == 0){
                soma += i;
            }
        }
        System.out.println(soma);
    }
}