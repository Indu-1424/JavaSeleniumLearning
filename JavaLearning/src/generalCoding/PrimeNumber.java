package generalCoding;

import java.util.Scanner;

class PrimeFind{
	
	public void find(int n) {
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				 flag=false;
			}
		}
		
		if(flag==true) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not Prime");
		}
	}
}

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number to check prime or not: ");
		int num=input.nextInt();
		
		PrimeFind pf=new PrimeFind();
		pf.find(num);
		

	}

}
