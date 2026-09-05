package colecoes;
import java.util.HashMap;
import java.util.Map;

public class Dicionarios {

    public static void main(String[] args) {

        HashMap<String, Integer> idades = new HashMap<>(); // Cria um dicionário vazio, onde a chave é uma String e o valor é um Integer

        idades.put("Murilo", 20); // Adiciona a chave "murilo" com o valor 20 no dicionário
        idades.put("Marcela", 25);
        idades.put("Rodrigo", 30);

        System.out.println(idades);

        //System.out.println(idades.get("Murilo"));  // Retorna o valor da chave "murilo"
        //System.out.println(idades.get("naoexiste")); //  Retorna null (o mesmo que none em python), pois a chave não existe

        //System.out.println(idades.containsKey("Murilo")); // Retorna True
        // System.out.println(idades.containsKey("naoexiste")); // Retorna False

        for (Map.Entry<String, Integer> par : idades.entrySet()) { // Para cada par de chave e valor no dicionário, pega a chave e o valor e imprime na tela
            String nome = par.getKey(); // Pega a chave do par
            Integer idade = par.getValue(); // Pega o valor do par
            System.out.printf("%s tem %d anos.%n", nome, idade);

        }

        System.out.println("--------------------------------------");
        idades.remove("Rodrigo"); // Remove a chave "Rodrigo" do dicionário
        idades.put("Murilo", 25); // Atualiza o valor da chave "Murilo" para 25
        System.out.println(idades);

    }

}
