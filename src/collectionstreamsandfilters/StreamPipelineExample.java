package collectionstreamsandfilters;

import java.util.Arrays;

public class StreamPipelineExample {

	public static void main(String[] args) {
		Arrays.stream(Object.class.getMethods())
        .map(method -> method.getName())
        .distinct()
        .forEach(System.out::println);

	}

}
