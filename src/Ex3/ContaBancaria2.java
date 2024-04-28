package Ex3;

public class ContaBancaria2 {
    double saldo;
    double valorSaque;
    double valorDeposito;

    public ContaBancaria2(double saldo, double valorSaque, double valorDeposito) {
        this.saldo = saldo;
        this.valorSaque = valorSaque;
        this.valorDeposito = valorDeposito;
    }

    public ContaBancaria2() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) throws ValorInvalidoException {
        try {
            if (saldo < 0) {
                throw new ValorInvalidoException("Só é permitido números maiores que 0 para o saldo.");
            } else {
                this.saldo = saldo;
            }
        }catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(double valorSaque) throws ValorInvalidoException {
        try {
            if (valorSaque < 0 || valorSaque > saldo) {
                throw new ValorInvalidoException("Só é permitido números maiores que 0, ou menores/iguais o saldo da conta para o saque.");
            } else {
                this.valorSaque = valorSaque;
            }
        }catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) throws ValorInvalidoException {
        try {
            if (valorDeposito < 0) {
                throw new ValorInvalidoException("Só é permitido números maiores que 0 para depositar.");
            } else {
                this.valorDeposito = valorDeposito;
            }
        }catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
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