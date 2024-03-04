package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the unique numbers in the Array
//Sort the Array
public class SortAndUnique {

	public static void main(String[] args) {
		
		List<Integer>numList=Arrays.asList(3,9,7,8,3,1,9);
		//Finding unique values from List
		List<Integer>uniqueList=numList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
		
		//Sorting the numbers in list
		System.out.println(numList.stream().sorted().collect(Collectors.toList()));
		
		
	}

}
