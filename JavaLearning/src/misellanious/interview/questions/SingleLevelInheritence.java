package misellanious.interview.questions;

class C{
	
	public void methodOne() {
		System.out.println("I am method 1");
	}
}

class B extends C{
	
	public void methodTwo() {
		System.out.println("I am in Method 2");
	}
}

class A extends B{
	public void methodThree() {
		System.out.println("I am in method 3");
	}
}

public class SingleLevelInheritence {

	public static void main(String[] args) {
		
		A obj =new A();
		obj.methodOne();
		obj.methodTwo();
		obj.methodThree();
				
		
		
		
	}

}
