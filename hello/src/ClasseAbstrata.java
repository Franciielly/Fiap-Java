public abstract class ClasseAbstrata {
        
    protected double saldo;

    public void sacar(double valor) throws SaldoInsuficiente{
        if (valor > saldo) {
            throw new SaldoInsuficiente();
        }
        saldo = saldo - valor;
    }
    public abstract double verificarSaldo();
}
