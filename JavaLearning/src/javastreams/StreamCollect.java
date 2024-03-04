package javastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Gautham","Don","Gauresh","Luci");
		List<String>ls=list.stream().filter(s->s.startsWith("G")).map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(ls);
	}

}
