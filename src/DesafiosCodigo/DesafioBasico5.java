package DesafiosCodigo;
import java.util.List;
import java.util.Scanner;

//Desafio corresponde a Busca Sequencial
public class DesafioBasico5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> elementos = List.of(64, 137, -16, 43, 67, 81, -90, 212, 10, 75);

        int elemento = leitor.nextInt();

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.


        if (elementos.contains(elemento))
            System.out.println("Achei "+ elemento + " na posicao " + elementos.indexOf(elemento));
        else
            System.out.println("Numero " + elemento + " nao encontrado!");
    }
}