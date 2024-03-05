package br.com.desafios.segundo;

public class SequenciaFibonacci {
    private int termoAnterior;
    private int termoAtual;

    public SequenciaFibonacci() {
        this.termoAnterior = 0;
        this.termoAtual = 1;
    }

    public int proximoTermo() {
        int proximoTermo = this.termoAnterior + this.termoAtual;
        this.termoAnterior = this.termoAtual;
        this.termoAtual = proximoTermo;
        return proximoTermo;
    }
}
