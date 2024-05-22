public class ContaCorrente extends ContaBancaria {
    private String tipo;
    private double chequeEspecial; 

    public ContaCorrente () {

    }

    public ContaCorrente (int numero,int agencia, double saldo,String tipo, double chequeEspecial) {
        super(numero,agencia,saldo);
        this.tipo = tipo;
        this.chequeEspecial = chequeEspecial;
    }

    public String getTipo () {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }

    public Double getChequeEspecia () {
        return chequeEspecial;
    }

    public void setChequeEspecial (double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    } 
    public double getSaldoDisponivel () {
        return getSaldo() + this.chequeEspecial;
    }

    @Override
    public void retirar (double valor) {
        valor = valor + 10;
        super.retirar(valor);
    }

    public void ExibirDetalhes (){
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: " + chequeEspecial);
    }
    
}
