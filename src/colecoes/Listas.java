package colecoes;

import java.util.ArrayList;


public class Listas {

    public static void main (String[] args) {

        //exercicio1();
        //exercicio2();
        //exercicio3();
        exercicio4();

    }

    public static void exercicio1() {

        // Exercício 1 — Criar uma lista de nomes (Strings), adicionar 3 itens nela usando .add(), e imprimir a lista inteira de uma vez (sem loop ainda).

        ArrayList<String> nomes = new ArrayList<>();

        // Em python, nomes.append("joão")

        nomes.add("João");
        nomes.add("Murilo");
        nomes.add("Carlos");
        nomes.add("Ricardo");

        //System.out.print(nomes);

    }

    public static void exercicio2() {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Ricardo");
        nomes.add("Murilo");
        nomes.add("João");

        // System.out.print(nomes.getFirst()); Pega o primeiro indice

        System.out.println(nomes.get(2));
        System.out.println(nomes.get(3));

        // nomes.size() é o mesmo que len(nomes) em python, ou seja, retorna o tamanho da lista

        System.out.print(nomes.size());

    }

    public static void exercicio3() {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Ricardo");
        nomes.add("Murilo");
        nomes.add("João");

        // Em java o : é o mesmo que o in em python



        for (String nome : nomes) {

            System.out.println(nome);
        }

    }

    public static void exercicio4() {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Ricardo");
        nomes.add("Murilo");
        nomes.add("João");

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(20);

        // NESTE PRINT, A LISTA ESTÁ COMPLETA
        System.out.println(nomes);

        nomes.remove("Carlos");

        // NESTE PRINT, A LISTA ESTÁ SEM O ITEM "CARLOS"
        System.out.println(nomes);

        nomes.remove(2);

        // NESTE PRINT, A LISTA ESTÁ SEM O ITEM "JOÃO", POIS É O ATUAL INDICE 2
        System.out.println(nomes);


        // NESTE PRINT, A LISTA ESTÁ COMPLETA
        System.out.println(numeros);

        // NESTE PRINT, REMOVEMOS O ITEM DE INDICE 1, QUE É O NÚMERO 2
        numeros.remove(1);

        System.out.println(numeros);

        // NESTA LINHA, REMOVEMOS O ITEM DE VALOR 20, QUE É O ÚLTIMO ITEM DA LISTA
        numeros.remove((Integer)20);
        // NOTE QUE, PARA REMOVER UM ITEM DE VALOR, PRECISAMOS FAZER UM CAST PARA INTEGER.
        // numeros.remove(Integer.valueOf(20)); OU ENTÃO FAZER COMO FIZEMOS NESSA LINHA, QUE É UM CAST MAIS SIMPLES.


        // NESTE PRINT, A LISTA ESTÁ SEM O ITEM 20
        System.out.println(numeros);

    }

}
