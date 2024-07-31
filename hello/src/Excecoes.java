import java.util.InputMismatchException;
import java.util.Scanner;
public class Excecoes {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    
    try {
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int divisao = numero1 / numero2;
        System.out.println("O resultado é: " + divisao);
    } catch (ArithmeticException e) {
        System.err.println("Erro ao dividir!");
    }catch (InputMismatchException e) {
        System.err.println("Erro de entrada de dados!");
    }finally {
        System.out.println("Finalizado a execução do programa!");
        sc.close();
    }

    // exceção com getMessage
    int [] array = new int[2];

    try {
        array[2] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Mensagem de erro: " + e.getMessage());
        e.printStackTrace();
    }
    }
}
