package misellanious.interview.questions;

public class ExceptionInterviewDemo {

	public static void main(String[] args) {
		
		System.out.println("Before try catch");

		try {
			int i=0;
			int[] intArr = {1,4,7,9};
			int result=intArr[4]/i;
			System.out.println(result);
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("After try catch");
	}

}
