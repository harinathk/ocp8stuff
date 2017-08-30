package lambdabuiltinfunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfMethod {

	public static void main(String[] args) {
		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
		
		greeting.removeIf(str -> !(str.startsWith("h")));
		greeting.forEach(System.out::println);

	}

}
