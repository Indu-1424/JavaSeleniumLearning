package misellanious.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="malayalam";
		
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
