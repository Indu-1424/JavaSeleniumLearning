package introduction;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		
		int num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		num1 =input.nextInt();
		
		System.out.print("Enter the 2nd Number:  ");
		num2=input.nextInt();
		
		int addition=num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+addition);
		
		int subtraction=num1-num2;
		System.out.println("Difference between "+num1+" and "+num2+" is: "+subtraction);
		
		int multiplication=num1*num2;
		System.out.println("Product of "+num1+" and "+num2+" is: "+multiplication);
		
		int division= num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" is: "+division);
		
		int modulus= num1%num2;
		System.out.println("Modulus of "+num1+" and "+num2+" is: "+modulus);
		
		
		
	}

}
