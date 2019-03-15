package scislak.program;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inScanner = new Scanner(System.in);
		String input = inScanner.nextLine();
		
		System.out.println(reverseText(input));
	}
	
	public static String reverseText(String text) {
		int lenght = text.length();
		char[] letters = text.toCharArray();
		char[] empty = new char[lenght];
		
		for(int i = 0; i < lenght; i++){
			empty[lenght -(i+1)] = letters[i];
		}
		return new String(empty);
	}
}
