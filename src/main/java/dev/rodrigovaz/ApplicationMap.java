package dev.rodrigovaz;

import java.util.HashMap;
import java.util.Map;

public class ApplicationMap {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario(new HashMap<>());
        Map<String, Double> cars = dicionario.cars();
        cars.put("celta", 2000d);
        cars.put("meriva", 12343123d);


        System.out.println(dicionario);
    }
}
