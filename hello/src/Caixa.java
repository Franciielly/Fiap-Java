public class Caixa {
    public static void main(String[] args) {
        
         int qtdProduto = 5;
         int registro = 0;

        /*while (registro < qtdProduto) {
            registro ++;
            System.out.println("O produto número " + registro + " foi registrado");
        } */

        /*do {
            registro ++;
            System.out.println("O caixa registrou o produto " + registro);
        } while (registro < qtdProduto); */

        for (int i = 1; i < qtdProduto; i++) {
            System.out.println("O caixa registrou o produto " + i);
        }
    }
    
}
