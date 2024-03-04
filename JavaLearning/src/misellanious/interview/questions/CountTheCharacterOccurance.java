package misellanious.interview.questions;

public class CountTheCharacterOccurance {

	public static void main(String[] args) {
		
		String name="I am a qa professional";
		int count=0;
		for(int i=0; i<name.length();i++) {
			char c=name.charAt(i);
			if(c=='a') {
				count++;
			}
		}
		
		System.out.println(" the count is: "+count);

	}

}
