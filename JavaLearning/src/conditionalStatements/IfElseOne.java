package conditionalStatements;

import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class IfElseOne {

	public static void main(String[] args) {
		
		int length, breadth;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the length :  ");
		length=input.nextInt();
		
		System.out.print("Enter the breadth : ");
		breadth=input.nextInt();
		
		if(length==breadth) {
			System.out.println("It is a square");
		}else {
			System.out.println("It is Rectangle");
		}
		
	}

}
