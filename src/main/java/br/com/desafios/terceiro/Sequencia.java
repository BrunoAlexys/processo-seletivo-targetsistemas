package br.com.desafios.terceiro;

public class Sequencia {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        System.out.println("Próximo elemento da sequência a: " + (a[a.length - 1] + 2));

        int[] b = {2, 4, 8, 16, 32, 64};
        System.out.println("Próximo elemento da sequência b: " + (b[b.length - 1] * 2));

        int[] c = {0, 1, 4, 9, 16, 25, 36};
        System.out.println("Próximo elemento da sequência c: " + ((c.length + 1) * (c.length + 1)));

        int[] d = {4, 16, 36, 64};
        System.out.println("Próximo elemento da sequência d: " + ((d.length + 2) * (d.length + 2)));

        int[] e = {1, 1, 2, 3, 5, 8};
        System.out.println("Próximo elemento da sequência e: " + (e[e.length - 2] + e[e.length - 1]));

        int[] f = {2, 10, 12, 16, 17, 18, 19};
        System.out.println("Próximo elemento da sequência f: " + (f[f.length - 1] + 1));
    }
}
