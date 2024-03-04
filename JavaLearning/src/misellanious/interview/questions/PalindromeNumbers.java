package misellanious.interview.questions;

public class PalindromeNumbers {

	public static void main(String[] args) {
		
		int num1=1881;
		int num2=0;
		int temp=num1;
		
		while(num1>0) {
		num2=num2*10+num1%10;
		num1=num1/10;
		}
		System.out.println(num2);
		
		if(temp==num2) {
			System.out.println("Numbers are palindrome");
		}else {
			System.out.println("Numbers are not palindrome");
		}

	}

}
