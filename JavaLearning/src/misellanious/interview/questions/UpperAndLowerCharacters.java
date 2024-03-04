package misellanious.interview.questions;
//From the string find the upper & lower characters
public class UpperAndLowerCharacters {

	public static void main(String[] args) {
		
		String stringOfChars="AutomaTion TestiNg TutoRial";
		
		String strOne="";
		String strTwo="";
		
		for(int i=0;i<stringOfChars.length();i++) {
			if(stringOfChars.charAt(i)>=65 && stringOfChars.charAt(i)<=90) {
				strOne=strOne+stringOfChars.charAt(i);
			}else {
				strTwo=strTwo+stringOfChars.charAt(i);
			}
		}
		
		System.out.println("count of Upper case characters: "+strOne.length());
		System.out.println("Upper case characters are: "+strOne);
		
		System.out.println("count of Lower case characters: "+strTwo.length());
		System.out.println("Lower case characters are: "+strTwo);
	}

}
