/** 
 * Classe que abstrai uma Conta Bancária
 * @author Francielly Oliveira
 * @version 1.0
 */

public class ContaBancaria {
    /**
     * Número da conta, agencia e saldo
     */
    public int numero, agencia;
    public double saldo;

    public ContaBancaria (int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria () {

    }

    public ContaBancaria (int numero, int agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    /**
     * Deposita um valor ao saldo da conta
     * @param valor Valor a ser depositado
     */
    public void depositar (double valor) {
        this.saldo += valor;
    }
    /**
     * Retira um valor do saldo da conta
     * @param valor Valor a ser retirado
     */
    public void retirar (double valor) {
        this.saldo -= valor;
    }
    /**
     * Verifica saldo da conta 
     * @return Valor do saldo da conta
     */
}