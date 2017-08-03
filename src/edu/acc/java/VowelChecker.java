package edu.acc.java;

/**
 * Write a class called VowelChecker that takes a String,
 * counts the number of vowels (aeiou) and prints the count.
 * 
 * @author pi
 *
 */

public class VowelChecker {

	public static void main(String[] args) {

		String vowels = "aeiou";
		String sentence = "I am an aardvark";
		int vowelCount = 0;

		for (int i=0; i < sentence.length(); i++) {
			String next = sentence.substring(i, i+1).toLowerCase();
			if (vowels.contains(next)) {
			    vowelCount++;
			    }
			
// following is extra code from class discussion
//			String me = sentence.substring(i, i+3);
//			char[] charm = me.toCharArray();
//			System.out.print("charm is ");
//			for (char c : charm) {
//			    System.out.print(c);
//			}
//			System.out.println();
//			
//			if (me.endsWith("dv")) {
//				System.out.println("found dv within substring starting at " 
//			       + i);
//				break;
//			}
//			char next = sentence.charAt(i);
//			if (isVowel(next)) {
//				vowelCount++;
//			}
		}

		System.out.println("Vowel count: " + vowelCount);
	}
	
	/**
	 * Vowel count method to show switch statement
	 * @param c is char to check
	 * @return true if a vowel, else false
	 */
	static boolean isVowel(char c) {
		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U': return true;
		}
		return false;
	}

}
