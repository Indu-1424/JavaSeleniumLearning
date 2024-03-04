package demo.statements;

import java.util.Scanner;

/*
 * ATM Cash Withdrawal. Verify the ATM PIN & the Cash withdrawal using If Else
 */

public class demoConditionalIf {

	public static void main(String[] args) {
		
		long realPin=123456;
		long availBalance=26789;
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Your PIN: ");
		long userPin=input.nextLong();
		if(userPin==realPin) {
			System.out.print("Enter Amount to withdraw: ");
			long userAmount=input.nextLong();
			if(userAmount<=availBalance) {
				System.out.println("You have withdrawn Rs."+userAmount+" successfully!!!");
				long remainBalance=availBalance-userAmount;
				System.out.println("Your Available Balance is: Rs."+remainBalance+"!!");
			}else {
				System.out.println("Sorry!!!! Insufficient Balance");
			}
			
		}else {
			System.out.println("OOPS!!!! You Entered wrong PIN.");
		}
			

	}

}
