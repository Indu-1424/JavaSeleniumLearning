package generalCoding;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="Quality";
		String reverse="";
		for(int i=0;i<name.length();i++) {
			 
			 reverse=name.charAt(i)+reverse;
			
		}
		System.out.println(reverse);
	}

}
