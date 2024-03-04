package conditionalStatements;

import java.util.Scanner;

//Based on the input number , predict the days of the week
public class SwitchDemo {

	public static void main(String[] args) {
		
		int number;
		Scanner input=new Scanner(System.in);
		
		System.out.print(" Enter the number to find the day in a scale of 1 to 7 : ");
		number=input.nextInt();
		
		switch(number){
		
		case 1:
		{
			System.out.println("Its Monday");
			break;
		}
		case 2:
		{
			System.out.println("Its Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Its Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Its Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Its Friday");
			break;
		}
		case 6:
		{
			System.out.println("Its Saturday");
			break;
		}
		case 7:
		{
			System.out.println("Its Sunday");
			break;
		}
		
		default:
		{
			System.out.println("Invalid input");
		}
			
		}
		
		
	}

}
