package streamapi;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumUse {

	public static void main(String[] args) {
		Stream<String> words = Pattern.compile(" ").splitAsStream("a bb ccc");

		//System.out.println(words.map(word->word.length()).sum());

		System.out.println(words.filter(word->word.length()>1).mapToInt(word->word.length()).sum());
		
	

	}

}
