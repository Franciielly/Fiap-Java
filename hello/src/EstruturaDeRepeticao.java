public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        int numero = 0;
        while (numero < 10 ) {
            numero += 1;
            System.out.println(numero);
        }  

        System.out.println();
        
        int numero2 = 0;
        do {
            numero2 += 1;
            System.out.println(numero2);
        }while (numero2 < 10);

        System.out.println();
        
        for (int i=0; i <=10; i++) {
            System.out.println(i);
        }
    }
}
