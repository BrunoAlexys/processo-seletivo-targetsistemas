package br.com.desafios.segundo;

public class CalcularFibonacci {
    public boolean verificarSequenciaFibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número inválido");
        }

        var fibonacci = new SequenciaFibonacci();
        int termoAtual;

        do {
            termoAtual = fibonacci.proximoTermo();
            if (termoAtual == numero) {
                return true;
            }
        } while (termoAtual <= numero);

        return false;
    }
}
