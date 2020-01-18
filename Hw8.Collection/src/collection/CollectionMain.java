package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
	public static void main(String[] args) {
		List<Passport> arrListOfPassports = new ArrayList<>();
		List<Passport> linkListOfPassports = new LinkedList<>();
		int numberOfPassports = 1_000_000;
		
		System.out.println("ArrayList statistic:");
		GenericList.add(arrListOfPassports, numberOfPassports);
		GenericList.remove(arrListOfPassports);
		System.out.println("");
		
		System.out.println("LinkedList statistic:");
		GenericList.add(linkListOfPassports, numberOfPassports);
		GenericList.remove(linkListOfPassports);
		System.out.println("");
	}
}
