package streamapi;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class PremitiveOptional {

	//using Stream
	public static void selectHighestTemperature(Stream<Double> temperatures) {
	    Optional<Double> max = temperatures.max(Double::compareTo);
	    if(max.isPresent()) {
	        System.out.println(max.get());
	    }
	}
	//Using DoubleStream
	public static void selectHighestTemperatureinDouble(DoubleStream temperatures) {
	    OptionalDouble max = temperatures.max();
	    max.ifPresent(System.out::println);
	}
	
	public static void main(String[] args) {
		selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
		
		selectHighestTemperatureinDouble(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));

	}

}
