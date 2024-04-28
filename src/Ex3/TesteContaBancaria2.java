package Ex3;

import Ex2.ContaBancaria;

public class TesteContaBancaria2 extends ContaBancaria {
    public static void main(String[] args) {

        ContaBancaria2 conta1 = new ContaBancaria2();
        ContaBancaria2 conta2 = new ContaBancaria2();
        ContaBancaria2 conta3 = new ContaBancaria2();

        conta1.setSaldo(-20);
        conta1.setValorDeposito(-55);
        conta1.setValorSaque(-10);

        conta1.Mostrar();

        conta2.setSaldo(100);
        conta2.setValorDeposito(50);
        conta2.setValorSaque(151);

        conta2.Mostrar();

        conta3.setSaldo(200);
        conta3.setValorDeposito(50);
        conta3.setValorSaque(100);

        conta3.Mostrar();







    }
}
