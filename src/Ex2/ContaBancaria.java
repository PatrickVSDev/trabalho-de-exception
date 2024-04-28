package Ex2;

public class ContaBancaria {
    double saldo;
    double valorSaque;
    double valorDeposito;

    public ContaBancaria(double saldo, double valorSaque, double valorDeposito) {
        this.saldo = saldo;
        this.valorSaque = valorSaque;
        this.valorDeposito = valorDeposito;
    }

    public ContaBancaria() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        try {
            if (saldo < 0) {
                throw new IllegalArgumentException("Só é permitido números maiores que 0 para o saldo.");
            } else {
                this.saldo = saldo;
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) {
        try {
            if (valorSaque < 0 || valorSaque > saldo) {
                throw new IllegalArgumentException("Só é permitido números maiores que 0, ou menores/iguais o saldo da conta para o saque.");
            } else {
                this.valorSaque = valorSaque;
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        try {
            if (valorDeposito < 0) {
                throw new IllegalArgumentException("Só é permitido números maiores que 0 para depositar.");
            } else {
                this.valorDeposito = valorDeposito;
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
    public void Mostrar() {
        System.out.println("O saldo da conta é: " + getSaldo());
        System.out.println("Foi feito um depósito no valor de: " + getValorDeposito());
        System.out.println("Foi feito um saque no valor de: " + getValorSaque());
        System.out.println();
    }
}