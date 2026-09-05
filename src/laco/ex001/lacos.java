package laco.ex001;

import java.util.Scanner;

public class lacos {

    public static void main (String[] args) {

        //exercicio1();
        //exercicio2();
        exercicio3();
    }

    public static void exercicio1() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = leitor.nextInt();

        for (int contador = 1; contador <= 10; contador++) {
            int resultado = numero * contador;
            System.out.printf("%d x %d = %d%n", numero, contador, resultado);
        }

        leitor.close();

    }

    public static void exercicio2() {

        for (int contador = 10; contador >= 0; contador--) {

            System.out.printf("Decolando em: %d%n", contador);
        }

        System.out.print("Decolagem! \uD83D\uDE80!");
    }

    public static void exercicio3() {

        int soma = 0;

        for (int contador = 0; contador <= 100; contador++) {

            if (contador % 2 == 0) {
                soma += contador;
            }
        }

        System.out.printf("A soma total dos números parés é: %d%n", soma);
    }

}