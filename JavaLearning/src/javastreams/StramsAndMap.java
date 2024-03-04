package javastreams;
//Display the names start with A in sorted Order & in Capital letters
import java.util.Arrays;
import java.util.List;

public class StramsAndMap {

	public static void main(String[] args) {
		
		String[] name= {"Adam","Don","Abhijeet","Gyan","Aloki"};
		List<String>names=Arrays.asList(name);
		
		//names.stream().filter(s->s.startsWith("A")).map(s->s.length()>4).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
