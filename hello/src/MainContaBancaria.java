public class MainContaBancaria {
    public static void main(String[] args) {
      ContaBancaria cc = new ContaBancaria();
      cc.saldo = 50;
      cc.agencia = 1234;
      cc.numero = 321;

      cc.depositar (100);

      System.out.println(cc.getSaldo());

      ContaBancaria poupanca = new ContaBancaria(111, 222, 1000);

      poupanca.retirar(50);

      System.out.println(poupanca.getSaldo());

    }
    
}
