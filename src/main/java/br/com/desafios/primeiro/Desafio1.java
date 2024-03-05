package br.com.desafios.primeiro;

public class Desafio1 {
    private int indice;
    private int soma;
    private int k;

    public Desafio1() {
        this.indice = 13;
        this.soma = 0;
        this.k = 0;
    }

    public void calcularSoma() {
        while (this.k < this.indice) {
            this.k++;
            this.soma += this.k;
        }
    }

    public void imprimirResultado() {
        System.out.println("Resultado da soma: " + this.soma);
    }

}
