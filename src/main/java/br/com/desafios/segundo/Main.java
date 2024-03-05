package br.com.desafios.segundo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele está na sequência de Fibonacci:");
        int numero = scanner.nextInt();

        var calcularFibonacci = new CalcularFibonacci();
        boolean pertenceSequencia = calcularFibonacci.verificarSequenciaFibonacci(numero);

        if (pertenceSequencia) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci");
        }
    }
}
