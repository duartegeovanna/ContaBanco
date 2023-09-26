package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws  Exception {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, digite o saldo que deseja iniciar na sua conta: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
