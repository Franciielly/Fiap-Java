public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente ();
        cc.setAgencia(145);
        cc.setNumero(14);
        cc.setTipo("PF");
        cc.setChequeEspecial(1150);
        cc.ExibirDetalhes ();
        System.out.println();

        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(900);
        conta1.retirar(50);
        

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(800);
        conta2.retirar(100);
        
        ContaBancaria conta3 = new ContaCorrente();
        conta3.depositar(500);
        conta3.retirar(25);

        System.out.println("Conta 1 = " + conta1.getSaldo());
        System.out.println("Conta 2 = " + conta2.getSaldo());
        System.out.println("Conta 3 = " + conta3.getSaldo());
    }

}
