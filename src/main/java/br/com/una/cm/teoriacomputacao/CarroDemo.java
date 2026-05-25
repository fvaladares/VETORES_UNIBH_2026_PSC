package br.com.una.cm.teoriacomputacao;

public class CarroDemo {
    public static void main(String[] args) {
        Carro c1 = new Carro(101, "Etios");
        Carro c2 = new Carro(100, "Etios");

        c1.setVelocidade(102);
        System.out.println(c1);

        System.out.println(c1 == c2);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.equals(c2));

    }
}
