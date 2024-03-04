package misellanious.interview.questions;

import java.util.HashMap;

public class CountUniqueWordsInString {

	public static void main(String[] args) {
		
		String sampString="Java is simple and Java is easy";
		
		String[] stringArray=sampString.split(" ");
		
		HashMap <String, Integer> stringMap=new HashMap<String, Integer>();
		int count=1;
		for(String s:stringArray) {
			if(!stringMap.containsKey(s)) {
				stringMap.put(s, count);
			}else {
				stringMap.put(s, stringMap.get(s)+1);
			}
		}
		
		for(String str:stringMap.keySet()) {
			System.out.println(str+" : "+stringMap.get(str));
		}

	}

}
