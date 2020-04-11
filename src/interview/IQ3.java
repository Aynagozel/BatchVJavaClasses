package interview;

public class IQ3 {

	public static void main(String[] args) {
		// 3. Find out how many alpha characters are present in a string?
		String given = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		String replaced = given.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced.length());

		// 4. How to find out the part of the string from a string? What is substring?
		// Find
		// number of words in string?
		String a = "Welcome to the interview sessions with Syntax";
		System.out.println(a.substring(39));
		String[] words = a.split(" ");
		System.out.println(words.length);
		for (String string : words) {
			System.out.println(string);
		}

		// 5. Write a java program to reverse String? Reverse a string word by word?

		// Reverse String:
		// Using Reverse Function:
		String b = "Hello Syntax";
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());

		// Without Using Reverse Function:
		String toReverse = "Hello World";

	}

}
