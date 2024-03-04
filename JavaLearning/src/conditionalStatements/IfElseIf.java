package conditionalStatements;
//Find Larget among 3 numbers
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		int firstNumber, secondNumber, thirdNumber;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		firstNumber=input.nextInt();
		
		System.out.print("Enter Second Number: ");
		secondNumber=input.nextInt();
		
		System.out.print("Enter Third Number: ");
		thirdNumber=input.nextInt();
		
		if((firstNumber>secondNumber)&&(firstNumber>thirdNumber)) {
			System.out.println("Larget among the 3 numbers is : "+firstNumber);
		}else if((secondNumber>firstNumber)&&(secondNumber>thirdNumber)) {
			System.out.println("Larget Among the 3 numbers is : "+secondNumber);			
		}else {
			System.out.println("Larget Among the 3 numbers is : "+thirdNumber);
		}

	}

}
