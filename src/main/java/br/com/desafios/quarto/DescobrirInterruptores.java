package br.com.desafios.quarto;

public class DescobrirInterruptores {
    public static void main(String[] args) {
        descobrirInterruptores();
    }

    public static void descobrirInterruptores() {
        int numInterruptores = 3;

        boolean[] interruptores = new boolean[numInterruptores];

        alternarInterruptores(interruptores);

        verificarLampadas(interruptores);
    }

    public static void alternarInterruptores(boolean[] interruptores) {
        System.out.println("Primeira tentativa: Ligar todos os interruptores");
        for (int i = 0; i < interruptores.length; i++) {
            interruptores[i] = true;
        }
        mostrarEstadoLampadas(interruptores);
    }

    public static void verificarLampadas(boolean[] interruptores) {
        System.out.println("Segunda tentativa: Verificar o estado das lâmpadas");
        for (int i = 0; i < interruptores.length; i++) {
            if (interruptores[i]) {
                // Se o interruptor estiver ligado, a lâmpada está acesa
                System.out.println("Interruptor " + (i + 1) + " controla a lâmpada " + (i + 1));
            }
        }
    }

    public static void mostrarEstadoLampadas(boolean[] interruptores) {
        System.out.println("Estado das lâmpadas:");
        for (int i = 0; i < interruptores.length; i++) {
            System.out.println("Lâmpada " + (i + 1) + ": " + (interruptores[i] ? "Acesa" : "Apagada"));
        }
    }
}
