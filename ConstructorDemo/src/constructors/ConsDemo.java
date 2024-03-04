package constructors;

public class ConsDemo {

	public static void main(String[] args) {
		
		Calc calc=new Calc(8,6);
		
		System.out.println(calc.numOne);
		System.out.println(calc.numTwo);
	}

}


class Calc{
	
	int numOne,numTwo,result;

	//Default constructor
	public Calc() {
		
		numOne=10;
		numTwo=30;
	}

		
	//parameterised constructor
	public Calc(int a) {
		numOne=a;
		numTwo=a;
	}
	
	public Calc(int m, int n) {
		numOne=m;
		numTwo=n;
	}
	
	
	
}