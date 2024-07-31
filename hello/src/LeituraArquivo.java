import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args) {
        try {
            FileReader stream = new FileReader("arquivo.txt");
            BufferedReader reader = new BufferedReader(stream);

            String linha = reader.readLine();
            while (linha!=null) {
                System.out.println(linha);
                linha = reader.readLine();
            }
            reader.close();
            stream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
