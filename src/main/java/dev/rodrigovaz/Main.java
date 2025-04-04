package dev.rodrigovaz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N) System.out.print(anterior);
            else System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;


        }
    }
}