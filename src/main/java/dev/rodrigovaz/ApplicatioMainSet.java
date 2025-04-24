package dev.rodrigovaz;

import java.util.*;


public class ApplicatioMainSet {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto(new HashSet<>(Arrays.asList(3d, 2d, 4d
                , 6d, 7d, 8d, 9d, 12321d,
                45324+52d, 454543d)));
        Set<Double> sets = conjunto.getSets();
        System.out.println(Collections.max(sets));

        // imprimir todos os valores do set
        sets.forEach(System.out::println);

        sets.removeIf(valor -> valor < 7);

        System.out.println("somente maiores que 7");
        sets.forEach(System.out::println);

        Set<Serie> series = new HashSet<>(){{
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Game of Throne", "fantasia", 55));
            add(new Serie("that 70' shows", "cmoedia", 40));
        }};
        series.forEach(System.out::println);

        // ordernar filmes por tempo de episodio
        Set<Serie> serieSorted = new TreeSet<>(series);
        serieSorted.forEach(System.out::println);
       System.out.println("Olá xpto mais um teste de assinatura");
    }
}
