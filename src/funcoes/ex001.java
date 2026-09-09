package funcoes;

public class ex001 {

    public static void main(String[] args) {

        //** System.out.println(ehPar(4));
        //* System.out.println(ehPar(5));
        // System.out.println(calcularMedia(8.75, 5.46));
        System.out.println(maiorEntre(5, 10, 15));
    }

    public static double calcularMedia(double a, double b) {

        return (a + b) / 2;
    }

    public static boolean ehPar(int numero) {

        return numero % 2 == 0;
    }

    public static int maiorEntre(int a, int b, int c) {

        return Math.max(a, Math.max(b, c)); // Primeira vê qual é o maior entre b e c, depois compara com a e retorna o maior
    }
}
