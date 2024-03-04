package javastreams;
//to find the names starting with G 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithoutStreamLogic {

	public static void main(String[] args) {

		List<String> nameList= new ArrayList<String>();
		nameList.add("Indu");
		nameList.add("Gautham");
		nameList.add("Sunil");
		nameList.add("Gauresh");
		int count=0;
		for (String name : nameList) {
			if(name.startsWith("G")) {
				System.out.println(name);
				count++;
			}
		}
		System.out.println("Count of Names starting with G: "+count);

			
		
		
		

	}

}
