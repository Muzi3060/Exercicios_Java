package laco.ex003;
import java.util.Scanner;


public class laco_do_enquanto {

    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        exercicio3();
    }

    public static void exercicio1() {

        Scanner leitor = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

        } while (opcao != 3);

        leitor.close();

    }

    public static void exercicio2() {

        Scanner leitor = new Scanner(System.in);

        int opcao;
        boolean valido;

        do {

            System.out.print("Digite um número: (Entre 1 e 100)");
            opcao = leitor.nextInt();

            valido = (opcao >= 1 && opcao <= 100);

            if (valido) {
                System.out.println("Número Válido!");
            } else {
                System.out.println("Número Inválido!");
            }
        } while (!valido);

        leitor.close();

    }

    public static void exercicio3() {

        Scanner leitor = new Scanner(System.in);

        int numero;
        int resultado = 1;
        int contador = 1;

        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        do {
            resultado *= contador;

            contador++;
        } while (contador <= numero);

        System.out.printf("O fatorial de %d é: %d", numero, resultado);
        leitor.close();
    }
}
