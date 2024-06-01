public class StringCon {
    public static void main(String[] args) {
       
        //método "somar" strings
        String nome = "Fiap";
        String slogan = "A melhor faculdade de tecnologia";
        String faculdade   = nome + " " + slogan;
        System.out.println(faculdade);
         
        //método com operador de atribuição aditiva (+=)
        faculdade = nome;
        faculdade += "-";
        faculdade += slogan;
        System.out.println(faculdade);

        //método concat
        faculdade = nome.concat (" - ").concat(slogan);
        System.out.println(faculdade);

        //comparação de String

        //método equals: diferencia até letra maiúsculo e minúsculo
        String curso = "Java";
        String curso2 = "java";
        if (nome.equals(curso2)) {
            System.out.println("As strings são iguais");
        }
        else {
            System.out.println("As strings são diferente");
        }

        //método equalsIgnoreCase: não diferencia caractere
        String eu = "Francielly";
        String eu2 = "FRANCIELLY";
        if (nome.equalsIgnoreCase(eu2)) {
            System.out.println("As strings são iguais");
        }
        else {
            System.out.println("As strings são diferentes");
        }

        //método starWith: veirifica primeira palavra ou caracteres

        String linguagem = "Java - Programação orientada a objetos";
        if (linguagem.startsWith("Java")) {
            System.out.println("A string começa com Java");
        }
        else {
            System.out.println("A string não começa com java");
        }

        //método endsWith: verifica últimos caracteres ou palavra
        if (linguagem.endsWith("tecnologia")){
            System.out.println("A string termina com tecnologia");
        }
        else {
            System.out.println("A string não termina com tecnologia");
        }

        //método length em string = recupera quantidade de caracteres

        int caractere = linguagem.length();
        System.out.println("A string possui " + caractere + " caracteres");

        //método charAt = recupera caractere em uma posição

        char caracter = linguagem.charAt(3);
        System.out.println("O quarto caracter da string é " + caracter);

        //método indexOf = localiza um caracter ou uma palavra e mostra sua posição (retorna -1 caso nao tenha o caracter)

        int posicao = linguagem.indexOf('o');
        System.out.println("O índice do caracter 'o' na string é " + posicao);

        int posicaoPalavra = linguagem.indexOf("Programação");
        System.out.println("O indice da palavra \"Programação\" na string é " + posicaoPalavra);

        //método lastIndexOf = localiza o último caracter ou palavra 

        int ultimaPosicao = linguagem.lastIndexOf('s');
        System.out.println("O índice do último caracter 's' na string é " + ultimaPosicao);

        //método substring = copia parte de uma string

        String nova = linguagem.substring(7, 38);
        System.out.println("A nova string é: " + nova);

        String nova2 = linguagem.substring (28);
        System.out.println("A nova String é: " + nova2);

        //método substring e indexOf
        String nova3 = linguagem.substring(linguagem.indexOf("orientada"), 38);
        System.out.println("A nova string é: " + nova3);

        //método substring e lastIndexOf 
        String nova4 = linguagem.substring(linguagem.lastIndexOf(' '));
        System.out.println("A nova string é: " + nova4);

        //método toUpperCase = deixa caracteres maiúsculo 
        String nova5 = linguagem.toUpperCase();
        System.out.println("A nova string é: " + nova5);

        //método toLowerCase = deixa caracteres minúsculos
        String nova6 = linguagem.toLowerCase();
        System.out.println("A nova string é: " + nova6);

        //método replace = substitui caracteres
        String nova7 = linguagem.replace ('o', 'x');
        System.out.println("A nova string é: " + nova7);
        System.out.println("String original: " + linguagem);

        String nova8 = linguagem.replace("Java", "C#");
        System.out.println("A nova string é: " + nova8);

        //método split = separa uma string em várias
        String [] palavras = linguagem.split (" ");
        for (String p : palavras) {
            System.out.println(p);
            System.out.println();
        }

        String disciplinas = "LTP;Web;Algoritmos;Banco de Dados";
        String [] dis = disciplinas.split (";");
        for (String d : dis){
            System.out.println(d);
        }


    }
    
}
