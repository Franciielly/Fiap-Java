 import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

      System.out.println("Digite sua idade: ");  
      int idade = sc.nextInt();
      sc.close();
      if (idade < 0) {
        System.out.println("Digite sua idade corretamente");
        return;
      }
      else if (idade >= 18 && idade <= 30) {
        System.out.println("Sua idade está entre 18 e 30 anos");
      }
      else {
        System.out.println("Sua idade não está entre 18 e 30 anos");
      }

    }
    
}
