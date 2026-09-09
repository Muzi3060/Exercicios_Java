package colecoes;

public class Lista_Fixa {

    public static void main(String[] args) {

        //** exercicio1();
        //exercicio2();
        exercicio3();
    }

    public static void exercicio1() {

        int[] numeros = {10, 20, 30, 40, 50}; // Lista de tamanho fixo, com valores definidos na criação
        int[] numeros_fixo = new int[5]; // Lista de tamanho fixo, sem valores definidos na criação


        System.out.println(numeros.length); // Retorna o tamanho da lista, no caso 5
        System.out.println(numeros[2]); // Retorna o valor do índice 2 da lista, no caso 30

        System.out.println(numeros_fixo.length); // Retorna o tamanho da lista, no caso 5
        System.out.println(numeros_fixo[2]); // Retorna o valor do índice 2 da lista, no caso 0, o que seria o mesmo para os outros indices dela

    }

    public static void exercicio2() {

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i*i;

        }

        for (int i : numeros) {

            System.out.println(i);
        }

    }

    public static void exercicio3() {

        int[] numeros = {1,2,3,4,5,6};

        int resultado = 0;

        for (int numero : numeros) {

            resultado += numero;
        }
        System.out.println(resultado);
    }
}
