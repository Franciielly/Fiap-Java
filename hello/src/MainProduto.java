public class MainProduto {
        public static void main(String[] args) {
    Produto [] produtos = new Produto [2]; 

    Produto prod1 = new Produto ();
    prod1.setNome("Limão");
    prod1.setDescricao("Galego");
    prod1.setValor(4);

    Produto prod2 = new Produto();
    prod2.setNome ("Maça");
    prod2.setDescricao("Gala");
    prod2.setValor(5);

    produtos[0] = prod1;
    produtos[1] = prod2;

    for (Produto prod : produtos) { // for each: para cada váriavel prod do tipo produto no array produtos
        System.out.println(prod.toString());
    }

     }  
}
