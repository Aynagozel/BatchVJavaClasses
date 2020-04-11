package interview;

import java.util.ArrayList;
import java.util.HashSet;

public class IQ6 {

	public static void main(String[] args) {
		// 9. How can you remove all duplicates from ArrayList?
		ArrayList<String> aList = new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		// 1 way
		HashSet<String> set = new HashSet<>(aList);
		System.out.println(set);
		// 2 way
		HashSet<String> hset = new HashSet<>();
		for (String name : aList) {
			hset.add(name);
		}
		System.out.println(hset);
		// 10. Versions of java you worked with? What version of java do you currently
		// use in
		// your framework? Difference between JRE, JDK ?
		// Version Name Release Date
		// Java SE 7 July 2011
		// Java SE 8 March 2014
		// Java SE 9 September 2017
		// Java SE 10 March 2018
		// Java SE 11 September 2018

	}

}
