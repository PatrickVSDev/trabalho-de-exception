package Ex2;

import java.util.Scanner;

public class TesteContaBancaria extends ContaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();

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
