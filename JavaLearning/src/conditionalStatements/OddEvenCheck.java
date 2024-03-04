package conditionalStatements;

import java.util.Scanner;

//Verify whether the given number is Odd or Even
public class OddEvenCheck {

	public static void main(String[] args) {
		
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		number=input.nextInt();
		
		if(number%2==0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is Odd");
		}
		
	}

}
