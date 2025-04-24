package dev.rodrigovaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExercicioList {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        Random randon = new Random(100);
        for (Integer i = 0; i < 50; i++)
            notas.add(randon.nextInt(25));

        Integer sum = 0;
        for (Integer valor : notas)
            sum += valor;

        System.out.println("a soma das notas é: " + sum);
    }
}
