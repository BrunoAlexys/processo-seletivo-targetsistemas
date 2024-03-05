package br.com.desafios.quinto;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        String stringInvertida = inverterString(inputString);

        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }

    public static String inverterString(String original) {
        char[] caracteres = original.toCharArray();

        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {

            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
