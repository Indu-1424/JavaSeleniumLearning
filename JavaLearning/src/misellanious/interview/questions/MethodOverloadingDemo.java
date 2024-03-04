package misellanious.interview.questions;

class Overload{
	
	void display(int a, int b) {
		System.out.println("In int display");
	}
	
	void display(double c, double d) {
		System.out.println("In double display");
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Overload over=new Overload();
		over.display('h','y');
		

	}

}
