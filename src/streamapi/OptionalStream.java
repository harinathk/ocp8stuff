package streamapi;

import java.util.Arrays;
import java.util.Optional;

public class OptionalStream {
	
	public static void main(String []args){
		Optional<String> string = Optional.of(" abracadabra ");
		string.map(String::trim).ifPresent(System.out::println);
		
		Optional<String> string1 = Optional.ofNullable(null);
		System.out.println(string1.map(String::length).orElse(-1));
		
	}

}
