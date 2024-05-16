import java.util.Scanner;
public class LeituraDeDados {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Idade digitada " + idade);
        sc.close();
    }
    
}
