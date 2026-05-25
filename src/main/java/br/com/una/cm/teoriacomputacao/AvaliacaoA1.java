package br.com.una.cm.teoriacomputacao;

import java.util.Scanner;

public class AvaliacaoA1 {
    public static void main(String[] args) {
        int soma = 1;
        int numero;
        Scanner scanner = new Scanner(System.in);

        do {
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma " + soma);
    }
}
