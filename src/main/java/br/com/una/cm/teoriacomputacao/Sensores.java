package br.com.una.cm.teoriacomputacao;

import java.util.Scanner;

public class Sensores {
    public static void main(String[] args) {
        int qtdSensores = 5;
        int[] notas = {10, 2, 5, 0, 8};
        double[] sensores = new double[qtdSensores];
        double acumulador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistema de controle de temperatura");
        System.out.println("Informe abaixo as temperaturas lidas:");
        for (int i = 0; i < qtdSensores; i++) {
            System.out.printf("Sensor %d:\\> ", (i + 1));
            sensores[i] = teclado.nextInt();
        }
        System.out.println();
        System.out.println("Temperaturas lidas: ");

        for (int i = 0; i < sensores.length; i++) {
            System.out.println(sensores[i]);
            acumulador += sensores[i];
        }

        System.out.println("A temperatura média foi: " +
                (acumulador / sensores.length));

//        System.out.println("Inteiros: ");
//        printArray(notas);

    }

    public static void printArray(int[] dados) {
        System.out.println("Iniciando impressão:");
        // for each or enhanced for.
        for (int elemento : dados) {
            System.out.println(elemento);
        }
    }

    public static void printArray(double[] dados) {
        System.out.println("Iniciando impressão:");
        // for each or enhanced for.
        for (double elemento : dados) {
            System.out.println(elemento);
        }
    }
}
