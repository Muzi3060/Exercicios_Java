package condicionais;

import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Começando o programa!");

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite sua idade");
        int idade = leitor.nextInt();

        if (idade >= 18 && idade <= 30) {
            System.out.print("Você é maior de idade.");
        } else if (idade > 30) {
            System.out.print("Você é velho!");
        } else {
            System.out.print("Você é menor de idade.");
        }

        leitor.close();
    }
}