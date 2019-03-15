package scislak.program;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		CountVowels cv = new CountVowels(input);
		System.out.println(cv.countAllVowels());
		System.out.println("A: " + cv.getCountVowelA());
		System.out.println("E: " + cv.getCountVowelE());
		System.out.println("O: " + cv.getCountVowelO());
		System.out.println("U: " + cv.getCountVowelU());
		System.out.println("I: " + cv.getCountVowelI());
		System.out.println("Y: " + cv.getCountVowelY());
	}
}