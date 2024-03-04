package javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WithStreams {

	public static void main(String[] args) {
		List<String> nameList= new ArrayList<String>();
		nameList.add("Indu");
		nameList.add("Gautham");
		nameList.add("Sunil");
		nameList.add("Gauresh");
		
		long c=nameList.stream().filter(s->s.startsWith("G")).count();
		System.out.println(c);
		
		nameList.stream().filter(s->s.startsWith("G")).forEach(s->System.out.println(s));
		
		

	}

}
