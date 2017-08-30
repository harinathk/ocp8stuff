package javaclassdesign;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerUse {

	public static void main(String[] args) {
		Stream<String> strings = Stream.of("hello", "world");
		Consumer<String> printString = System.out::println;
		strings.forEach(printString);
		
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");

	}

}
