package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

class Utilities{
	public static <T> void fill(List<T> list, T val){
		for(int i=0;i<list.size();i++)
			list.set(i, val);
	}
}

public class UtilitiesTest {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		System.out.println("The original list is "+intList);
		Utilities.fill(intList, 100);
		System.out.println("The list after calling Utilities.fill() is (int) "+intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello ");
		strList.add("World");
		System.out.println("The Original str List is "+strList);
		Utilities.fill(strList, "Java8");
		System.out.println("The list after calling Utilities.fill() is (str) "+strList);

	}

}
