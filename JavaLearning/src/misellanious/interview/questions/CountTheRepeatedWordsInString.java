package misellanious.interview.questions;

import java.util.HashMap;
import java.util.Scanner;

//Program to Count the repeated words in the String
public class CountTheRepeatedWordsInString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the String to validate: ");
		String inputString =input.nextLine();
		
		String[] wordArray=inputString.split(" ");
		
		HashMap<String, Integer>wordMap=new HashMap<String, Integer>();
		int count=1;
		
		for(String word:wordArray) {
			if(!wordMap.containsKey(word)) {
				wordMap.put(word, count);
			}else {
				wordMap.put(word, wordMap.get(word)+1);
			}
		}
		
		for(String w:wordMap.keySet()) {
			System.out.println("The count of "+w+" : "+wordMap.get(w));
		}
	}

}
