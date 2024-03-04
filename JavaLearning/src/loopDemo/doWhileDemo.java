package loopDemo;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
public class doWhileDemo {

	public static void main(String[] args) {
		
		int number,i = 1;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number to generate multiplication table: ");
		number=input.nextInt();
		do {
			int result=i*number;			
			System.out.println(i+"*"+number+"= "+result);
			i++;
			
		}while(i<=12);
	}

}
