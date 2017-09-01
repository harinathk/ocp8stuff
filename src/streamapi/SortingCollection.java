package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		List<String> words =
                Arrays.asList("follow your heart but take your brain with you".split(" "));
		//Sorts based on Lexicographical
		System.out.println("Sorts based on lexicographical");
		words.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("Sorts based on word length...");
		Comparator<String> lengthCompare = (str1,str2) ->str1.length() - str2.length();
		words.stream().distinct().sorted(lengthCompare).forEach(System.out::println);

	}

}
