package scislak.program;

import java.util.Arrays;
import java.util.LinkedList;

public class SummaryString {
	private String input;
	
	private int countWords;
	private float averrageCount;
	
	private String shorterWord;
	private String longerWord;
	
	public SummaryString(String input) {
		this.input = input;
	}

	public void summaryText() {
		summaryText(input);
	}
	
	public void summaryText(String input) {
		LinkedList<String> words = new LinkedList<>(Arrays.asList(input.trim().split(" ")));
		int temp =0;
		int lenghtShort =words.get(0).length();;
		int lenghtLong =0;
		
		for(int i =0; i < words.size(); i++) {
			if(words.get(i).trim().equals(""))
				words.remove(i);
			
			int lenghtTemp = words.get(i).length();
			temp +=lenghtTemp;
			
			if(lenghtTemp > lenghtLong) {
				longerWord = words.get(i);
				lenghtLong = lenghtTemp;
			}
			
			if(lenghtTemp < lenghtShort) {
				shorterWord = words.get(i);
				lenghtShort = lenghtTemp;
			}
		}
		
		countWords = words.size();
		averrageCount = temp /countWords;
		
		for(String a: words)
			System.out.println(a);
	}

	public String getInput() {
		return input;
	}

	public int getCountWords() {
		return countWords;
	}

	public float getAverrageCount() {
		return averrageCount;
	}

	public String getShorterWord() {
		return shorterWord;
	}

	public String getLongerWord() {
		return longerWord;
	}
}
