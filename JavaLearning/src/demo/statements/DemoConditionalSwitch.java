package demo.statements;

import java.util.Scanner;

/*
 * Using Switch Statements, verify the entered month falls under Winter/Summer/Spring or Autumn season
 */

public class DemoConditionalSwitch {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		System.out.print(" Please Enter a month from 1 to 12");
		
		int month=input.nextInt();
		
		switch(month) {
		
		case 1: 
			System.out.println("January falls under Winter Season");
			break;
			
		case 2:
			System.out.println("February falls under Winter season");
		    break;
		    
		case 3:
			System.out.println("March falls under Spring season");
		    break;
		    
		case 4:
			System.out.println("April falls under Spring season");
		    break;
		    
		case 5:
			System.out.println("May falls under Spring season");
		    break;
		
		case 6:
			System.out.println("June falls under Summer season");
		    break;
		
		case 7:
			System.out.println("July falls under Summer season");
		    break;
		    
		case 8:
			System.out.println("August falls under Summer season");
		    break;
		    
		case 9:
			System.out.println("September falls under Autumn season");
		    break;
		    
		case 10:
			System.out.println("October falls under Autumn season");
		    break;
		    
		case 11:
			System.out.println("November falls under Autumn season");
		    break;
		    
		case 12:
			System.out.println("December falls under Winter season");
		    break;
		    
		default: 
			System.out.println("Please enter a whole number between 1 & 12");
		
		
		}
	

	}

}
