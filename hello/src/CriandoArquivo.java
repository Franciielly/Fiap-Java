import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

public class CriandoArquivo {
    public static void main(String[] args) {
        try {
        FileWriter stream = new FileWriter("arquivo.txt");
        PrintWriter print = new PrintWriter(stream); 

        print.println("Teste");
        print.println("Escrevendo no arquivo");
            
        print.close();
        stream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
