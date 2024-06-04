package com.guilhermeproject;

import java.util.Scanner;

public class Calculadora {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op1, op2, opcao = 0, resp;

        System.out.print("Operando 1: ");
        op1 = scanner.nextInt();
        System.out.print("Operando 2: ");
        op2 = scanner.nextInt();

        while (opcao != 5) {
            System.out.println("------- ESCOLHA UMA OPERAÇÃO -------");
            System.out.println("[ 1 ] Adição");
            System.out.println("[ 2 ] Subtração");
            System.out.println("[ 3 ] Multiplicação");
            System.out.println("[ 4 ] Entrar com novos dados");
            System.out.println("[ 5 ] Sair");
            System.out.print(">>>>>>> SUA OPÇÃO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    resp = op1 + op2;
                    System.out.println("------------------------------");
                    System.out.println("Calculando " + op1 + " + " + op2 + " = " + resp);
                    System.out.println("------------------------------");
                    break;
                case 2:
                    resp = op1 - op2;
                    System.out.println("------------------------------");
                    System.out.println("Calculando " + op1 + " - " + op2 + " = " + resp);
                    System.out.println("------------------------------");
                    break;
                case 3:
                    resp = op1 * op2;
                    System.out.println("------------------------------");
                    System.out.println("Calculando " + op1 + " x " + op2 + " = " + resp);
                    System.out.println("------------------------------");
                    break;
                case 4:
                    System.out.print("Operando 1: ");
                    op1 = scanner.nextInt();
                    System.out.print("Operando 2: ");
                    op2 = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("============== SAINDO =============");
                    break;
                default:
                    System.out.println("========== OPÇÃO INVALIDA ==========");
                    break;
            }
        }

        scanner.close();
    }
}