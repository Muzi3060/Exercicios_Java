package manipulao_texto;
import java.util.Scanner;


public class exercicio {

    public static void main(String[] args) {

        //**exercicio1();
        //exercicio2();
        exercicio3();
    }

    public static void exercicio1() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().toLowerCase();

        if (nome.equals("admin")) {
            System.out.println("Bem-vindo, Administrador");
        } else {
            System.out.println("Acesso negado!");
        }
        scanner.close();
    }

    public static void exercicio2() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto, qualquer: ");
        String texto = scanner.nextLine();

        for (String palavra : texto.split(" ")) { // Para cada palavra do texto, imprima a palavra e o tamanho dela

            System.out.printf("%s, %d%n",palavra, palavra.length()); // Conta o total de letras de cada palavra (index) dentro da lista palavras
        }

        String[] palavras = texto.split(" "); // Cria uma lista de palavras a partir do texto, separando por espaço
        System.out.printf("Este texto tem: %d palavras",palavras.length); // Conta o total de palavras (index) dentro da lista palavras

        scanner.close();
    }

    public static void exercicio3() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto, qualquer com espaços: ");
        String texto = scanner.nextLine();

        System.out.println(texto); // texto sem tratamento
        System.out.println(texto.trim()); // texto com tratamento, remove espaços no inicio e no final
        System.out.println(texto.trim().substring(0, 5)); // texto com tratamento, remove espaços no inicio e no final e pega os 5 primeiros caracteres
        scanner.close();
    }
}
