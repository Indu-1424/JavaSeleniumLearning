package loopDemo;
//Write a program to calculate the sum of first 10 natural number.
public class whileDemo {

	public static void main(String[] args) {
		
		int sum=0,i=1;
		
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		
		System.out.println("Sum of 1st 10 natural numbers is : "+sum);
		
	}

}
