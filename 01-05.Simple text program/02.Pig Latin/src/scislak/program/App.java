package scislak.program;

import java.util.Scanner;

public class App {
	public static final char[] vowels = {'a', 'e', 'o', 'u', 'i', 'y'};
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inScanner = new Scanner(System.in);
		String input = inScanner.nextLine();
		
		System.out.println(changeString(input));
	}
	
	public static String changeString(String word) {
		String convwerted = word.toLowerCase().trim();
		char[] letters = convwerted.toCharArray();
		
		if(checkIsVowel(letters[0])) {
			if(checkIsVowel(letters[2]))
				return new String(word.trim().substring(2, word.trim().length()) + word.trim().substring(0, 2) + "ay").toLowerCase();
			else
				return word.toLowerCase().trim() + "way";
		}else {
			for(int i = 0; i< letters.length; i++) {
				if(checkIsVowel(letters[i])) {
					return new String(word.trim().substring(i, word.trim().length()) + word.trim().substring(0, i) + "ay").toLowerCase();
				}
			}
			return word.toLowerCase().trim() + "ay";
		}
	}
	
	private static boolean checkIsVowel(char letter) {
		for(char a: vowels) {
			if(a == letter) 
				return true;
		}
		return false;
	}
}
