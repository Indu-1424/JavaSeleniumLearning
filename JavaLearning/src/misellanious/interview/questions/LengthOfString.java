package misellanious.interview.questions;
//find the length of string without using length method
public class LengthOfString {

	public static void main(String[] args) {
		int count=0;
		String name="My name is Indu";

		System.out.println(name.length()); //length using length method

		//without using length method
		char[] nameArray=name.toCharArray();

		for(char n:nameArray) {

			count++;
		}

		System.out.println(count);

	}

}
