package streamapi;

import java.util.List;
import java.util.Arrays;

public class UsingFlatMap {

	public static void main(String[] args) {
		List<List<Integer>> intsofInts = Arrays.asList(
				Arrays.asList(1,3,5),
				Arrays.asList(2,4));
		
		intsofInts.stream()
			.flatMap(ints -> ints.stream())
			//.sorted()
			.map(i->i*i)
			.forEach(System.out::println);
			
	}

}
