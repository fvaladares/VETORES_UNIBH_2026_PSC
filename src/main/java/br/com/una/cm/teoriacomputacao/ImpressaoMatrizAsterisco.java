package br.com.una.cm.teoriacomputacao;

import java.util.Scanner;

public class ImpressaoMatrizAsterisco {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println(".:| Sistema de impressão de matrizes de asteríscos |:.");

        System.out.print("Informe a quantidade de linhas desejada (n): ");
        n = input.nextInt();

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }



        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j < i) {
                    System.out.print("   ");
                } else
                    System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((n - j) > (i + 1))
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == n - 1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j == n - 1))
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }

    }
}
