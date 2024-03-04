package loopDemo;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number. 
public class forDemo {

	public static void main(String[] args) {
		
		int number;
		boolean flag=true;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number: ");
		number=input.nextInt();
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				flag=false;
				//System.out.println("Number is nonprime");
			}
		}
		if(flag==false) {
			System.out.println("Number "+number+" is not prime");
		}else {
			System.out.println("Number "+number+" is prime");
		}
	
	}

}
