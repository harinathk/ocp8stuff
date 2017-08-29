package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	
	static void printList(List<?> list){
		for(Object element: list){
			System.out.println("["+element+"]");
		}
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(new Integer(10));
		intList.add(100);
		printList(intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		printList(strList);

	}

}
