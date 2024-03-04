package interfaceD;

interface A{
	public void getData();
}

class B{
	public void getData() {
		System.out.println("Result");
	}
}

class C extends B implements A{
	
}


public class InterviewQuestion {

	public static void main(String[] args) {
		
		A a= new C();
		a.getData();
	}

}
