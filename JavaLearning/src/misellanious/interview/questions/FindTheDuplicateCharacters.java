package misellanious.interview.questions;

import java.util.HashMap;

public class FindTheDuplicateCharacters {

	public static void main(String[] args) {
		
		String name="occurence";
		char[] charArray=name.toCharArray();
		int count=1;		
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(char c:charArray) {
			if(!charMap.containsKey(c)) {
				charMap.put(c,count);
			}else {
				charMap.put(c, charMap.get(c)+1);
			}
		}
		
		for(char a:charMap.keySet()) {
			System.out.println(a+" : "+charMap.get(a));
		}
		
	}

}
