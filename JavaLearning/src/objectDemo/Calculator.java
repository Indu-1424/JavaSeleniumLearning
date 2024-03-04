package objectDemo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		Addition add = new Addition();
		
		System.out.println(" Enter Number1: ");
		int num1=input.nextInt();
		
		System.out.println(" Enter Number2: ");
		int num2=input.nextInt();		
		
		int res=add.sum(num1,num2);
		System.out.println("Sum of numbers : "+res);

	}

	

}

 class Addition{
	 
	 public int sum(int n1, int n2) {
		 int result=n1+n2;
		 return result;
	 }
	
}