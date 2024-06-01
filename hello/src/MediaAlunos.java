import java.util.Scanner;
public class MediaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float notas [] = new float [10];
        float totalNotas = 0;
        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota do aluno: ");
            notas [i] = sc.nextFloat();
            totalNotas += notas [i];
        }
        float mediaNotas = totalNotas/notas.length;
        System.out.println("A média do alunos é " +mediaNotas);
        sc.close();
    }
    
}
