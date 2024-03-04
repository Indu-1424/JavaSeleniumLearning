package misellanious.interview.questions;

import java.util.Arrays;

//Anagram means 2 strings are made with same character
public class AnagramString {

	public static void main(String[] args) {
		
		String name1="Mary";
		String name2="domy";
		
		char[]array1=name1.toLowerCase().toCharArray();
		char[]array2=name2.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("Two strings are anagram strings");
		}else {
			System.out.println("Strings are not anagram");
		}

	}

}
