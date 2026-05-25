package br.com.una.cm.teoriacomputacao;

public class Carro {
    private int velocidade;
    private String modelo;

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro(int velocidade, String modelo) {
        this.velocidade = velocidade;
        this.modelo = modelo;
    }

    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }

    public void freiar (int velocidade) {
        this.velocidade -= velocidade;
        if(this.velocidade < 0)
            this.velocidade = 0;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true; // São a mesma referência?
        if (obj == null || getClass() != obj.getClass()) return false; // É nulo ou classe diferente?
        Carro c1 = (Carro) obj;
        return this.velocidade == c1.velocidade && this.modelo.equals(c1.modelo);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
