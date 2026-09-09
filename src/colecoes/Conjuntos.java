package colecoes;
import java.util.HashSet;

public class Conjuntos {

    public static void main(String[] args) {

        HashSet<Integer> numerosA = new HashSet<>();
        HashSet<Integer> numerosB = new HashSet<>();

        for (int i = 1; i <= 6; i++) {
            numerosA.add(i);
        }

        for (int i = 5; i <= 12; i++) {
            numerosB.add(i);
        }

        System.out.println("Set numerosA: " + numerosA);
        System.out.println("Set numerosB: " + numerosB);

        // Interseção // Pega valores iguais das duas listas e retorna somente os valores iguais

        //numerosA.retainAll(numerosB);
        //System.out.println("Interseção: " + numerosA);

        // União // Pega todos os valores das duas listas e retorna somente os valores diferentes
        //numerosA.addAll(numerosB);
        //System.out.println("União: " + numerosA);
    }
}
