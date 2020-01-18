package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {
	public static void main(String[] args) {
		List<Passport> listOfPassports = new ArrayList<>();
		int numberOfPassports = 1_000_000;
		long startTime = 0;
		long endTime = 0;
		long totalTime = 0;
		for(int i = 0; i < numberOfPassports; i++) {
			Passport passport = new Passport();
			startTime = System.currentTimeMillis();
			listOfPassports.add(passport);
			endTime = System.currentTimeMillis();
			totalTime += endTime - startTime;
		}
		System.out.println("Time to add all items: " + totalTime + " ms");
		
		// remove items from the end
		for(int i = numberOfPassports - 1; i >= 0; i--) {
			startTime = System.currentTimeMillis();
			listOfPassports.remove(i);
			endTime = System.currentTimeMillis();
			totalTime += endTime - startTime;
		}
		System.out.println("Time to remove all items from the end: " + totalTime + " ms");
		
		for(int i = 0; i < numberOfPassports; i++) {
			Passport passport = new Passport();
			listOfPassports.add(passport);
		}
		
		// remove items from the start
		for(int i = 0; i < numberOfPassports; i++) {
			startTime = System.currentTimeMillis();
			listOfPassports.remove(0);
			endTime = System.currentTimeMillis();
			totalTime += endTime - startTime;
		}
		System.out.println("Time to remove all items from the start: " + totalTime + " ms");
	}
}
