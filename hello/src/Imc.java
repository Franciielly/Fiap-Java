import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        if (altura <= 0 ) {
            System.out.println("Altura inválida");
            return;
        }
        System.out.print("Digite seu  peso: ");
        double peso = sc.nextDouble();
        if (peso <= 0) {
            System.out.println("Peso inválido");
            return;
        }
        double imc = peso/(altura*altura);
        System.out.println(imc);

        if (imc <18)  {
            System.out.println("Você está abaixo do peso");
        }
        else if (imc <=25) {
            System.out.println("Você está no peso ideal");
        }
        else {
            System.out.println("Você está acima do peso");
        }
        
    }
}
