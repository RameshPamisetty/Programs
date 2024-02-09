package com.cap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Hello {

	public static void main(String[] args) {

		String str = "Pamisetty Gangaraju Ramesh";

		String reversedString = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));

		System.out.println("Orginal String: " + str);
		System.out.println("Reversed String: " + reversedString);

	}
}
