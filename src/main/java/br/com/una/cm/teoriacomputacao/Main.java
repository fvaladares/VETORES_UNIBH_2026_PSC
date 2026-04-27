package br.com.una.cm.teoriacomputacao;

public class Main {
    public static void main(String[] args) {
        int[] notas = {10, 2, 5, 0, 8};
        int[] notas2 = new int[notas.length];
        int j = 0;

        System.out.println("Tamanho do vetor " + notas.length);
        printArray(notas);
        System.out.println("Imprimindo em ordem inversa");
        for (int i = (notas.length - 1);
             i >= 0;
             i--) {
            System.out.println(notas[i]);
        }
        for (int i = (notas.length - 1);
             i >= 0;
             i--) {
            notas2[j] = notas[i];
            j++;
        }
        printArray(notas2);
        notas2 = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            notas2[notas.length - (i + 1)] = notas[i];
        }
        printArray(notas2);
    }

    public static void printArray(int[] vetor) {
        System.out.println("Iniciando impressão:");

        // for each or enhanced for.
        for (int j : vetor) {
            System.out.println(j);
        }
    }
}