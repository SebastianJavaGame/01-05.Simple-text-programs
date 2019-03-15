package scislak.program;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner inScanner = new Scanner(System.in);
		String input = inScanner.nextLine();
		
		SummaryString sm = new SummaryString(input);
		sm.summaryText();
		
		System.out.println(sm.getCountWords());
	}

}
