public class Operadores {
    public static void main(String[] args) {

        int a = 10;
        a++;
        System.out.println(a);

        a--;
        System.out.println(a);

        System.out.println();

        int idade=10;
        boolean maiorIdade = idade > 18;
        System.out.println(idade);
        System.out.println("é maior idade: " + maiorIdade);
        
        System.out.println();

        int f = 40;
        f += 10;
        System.out.println(f);

        System.out.println();

        int g = 15, t = 3, m = 7;

        g = t++;

        System.out.println("G = " + g);
        System.out.println("T = " + t);

        int o = 15, j = 3, k = 7;
        o = --j;

        System.out.println("J = " + j);
        System.out.println("O = " + o);

        
    }
}
