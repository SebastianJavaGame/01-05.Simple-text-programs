package scislak.program;

public class CountVowels {
	private String text;
	
	private int countVowelA;
	private int countVowelE;
	private int countVowelO;
	private int countVowelU;
	private int countVowelI;
	private int countVowelY;

	public CountVowels(String text) {
		this.text = text;
	}
	
	private void cleanUp() {
		this.countVowelA =0;
		this.countVowelE =0;
		this.countVowelO =0;
		this.countVowelU =0;
		this.countVowelI =0;
		this.countVowelY =0;
	}
	
	public int countAllVowels() {
		cleanUp();
		char[] charsForInput = text.trim().toLowerCase().toCharArray();
		
		for(int i =0; i <charsForInput.length; i++) {
			if(charsForInput[i]=='a')
				countVowelA++;
			else if(charsForInput[i]=='e')
				countVowelE++;
			else if(charsForInput[i]=='o')
				countVowelO++;
			else if(charsForInput[i]=='u')
				countVowelU++;
			else if(charsForInput[i]=='i')
				countVowelI++;
			else if(charsForInput[i]=='y')
				countVowelY++;
		}
		return countVowelA +countVowelE +countVowelO +countVowelU + countVowelI + countVowelY;
	}

	public int getCountVowelA() {
		return countVowelA;
	}
	
	public int getCountVowelE() {
		return countVowelE;
	}
	
	public int getCountVowelO() {
		return countVowelO;
	}
	
	public int getCountVowelU() {
		return countVowelU;
	}
	
	public int getCountVowelI() {
		return countVowelI;
	}
	
	public int getCountVowelY() {
		return countVowelY;
	}
	
	public String getText() {
		return this.text;
	}
}
