package streamapi;

import java.util.List;
import java.util.Arrays;

public class UsingMap {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		integers.stream()
				.map(i->i*i)
				.forEach(System.out::println);
		

	}

}
