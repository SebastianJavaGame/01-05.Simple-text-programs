package scislak.program;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		System.out.println(checkIsPalindrome(input));
	}

	public static boolean checkIsPalindrome(String input) {
		char[] letters = input.toCharArray();
		
		for(int i =0; i<letters.length/2; i++) {
			if(letters[i] != letters[letters.length -(i+1)])
				return false;
		}
		return true;
	}
}
