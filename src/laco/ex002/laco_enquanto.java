package laco.ex002;

import java.util.Scanner;

public class laco_enquanto {

    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        exercicio3();

    }

    public static void exercicio1() {

        int contador = 1;

        while (contador < 11) {

            System.out.printf("Contador: %d%n", contador);
            contador++;
        }

        System.out.print("Contador chegou ao fim. saindo do loop!");

    }

    public static void exercicio2() {

        Scanner leitor = new Scanner(System.in);

        int soma = 0;
        int numero = 1;

        while (numero != 0) {

            System.out.print("Digite um número: (0 para sair) ");

            numero = leitor.nextInt();

            soma += numero;

        }

        System.out.printf("A soma dos números digitados é: %d%n", soma);
        leitor.close();

    }

    public static void exercicio3() {

        Scanner leitor = new Scanner(System.in);

        boolean ehPrimo = true;

        int divisor = 2;
        int numero = 0;

        System.out.printf("%nDigite um número: ");
        numero = leitor.nextInt();

        if (numero < 2) {
            ehPrimo = false;
        }

        while (divisor < numero) {

            if (numero % divisor == 0) {

                ehPrimo = false;
                break;
            } else {
                divisor++;
            }
        }

        if (ehPrimo) {
            System.out.printf("%d é um número primo.%n", numero);
        } else {
            System.out.printf("%d não é um número primo.%n", numero);
        }

        leitor.close();

    }
}
