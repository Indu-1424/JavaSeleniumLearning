package conditionalStatements;

import java.util.Scanner;

//Take two int values from user and print greatest among them.

public class IfElsoTwo {

	public static void main(String[] args) {
		
		int firstNumber, secondNumber;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the 1st Number: ");
		firstNumber=input.nextInt();
		
		System.out.print("Enter the 2nd Number: ");
		secondNumber=input.nextInt();
		
		if(firstNumber>secondNumber) {
			System.out.println("The greatest Number is: "+firstNumber);
		}else {
			System.out.println("The greatest number is: "+secondNumber);
		}
	}

}
