package dev.rodrigovaz.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberApplication {

    public static void main(String[] args) {
	List<String> numbers = Arrays.asList("1", "5", "9", "8", "2", "3", "4",
		"5", "11", "20");

	System.out.println("Números com valores impares");
	List<Integer> numberOdd = numbers.stream().map(Integer::parseInt)
		.collect(Collectors.toList()).stream()
		.filter(number -> number % 2 != 0).collect(Collectors.toList());

	System.out.println(numberOdd);
    }

}
