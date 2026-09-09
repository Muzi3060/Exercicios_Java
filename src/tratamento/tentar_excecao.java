package tratamento;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class tentar_excecao {

    public static void main(String[] args) {

        //exercicio1();
        //exercicio2();
        exercicio3();
    }

    public static void exercicio1() {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Número inválido. Digite um número inteiro.");
        } finally {
            scanner.close();
        }

    }

    public static void exercicio2() {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        try {
            System.out.println(lista.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: Índice buscado é maior do que o tamanho da lista.");
        }
    }

    public static void exercicio3() {

        try {
            String[] numeros = {"1", "abc", "3", "caik", "5"};
            int resultado = 1;

            for (String numero : numeros) {
                resultado += Integer.parseInt(numero);
            }
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valores inválidos");
        }
    }
}
