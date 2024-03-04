package generalCoding;
//To find the reverse of a number
import java.util.Scanner;

class InverNumber{
	
	public long reverseNumber(long number) {
		
		long revNumber=0;
		while( number!=0) {
			  revNumber=revNumber*10 + number%10;
			 number=number/10;
		}
		return revNumber;
	
	}
}

public class ReverseNumber {

	public static void main(String[] args) {
		

		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		long num= input.nextInt();
		
		InverNumber inv= new InverNumber();
		
		long reversedNumber=inv.reverseNumber(num);
		
		System.out.println("the Reversed number is: "+reversedNumber);
		
		
		}

}
