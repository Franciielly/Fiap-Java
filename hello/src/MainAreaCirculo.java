import java.util.Scanner;
public class MainAreaCirculo {
    public static void main(String[] args) {
        AreaCirculo circulo = new AreaCirculo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        circulo.setRaio(raio);
        double area = circulo.calcularArea();
        System.out.println("Área do círculo: " + area);
    }
}

