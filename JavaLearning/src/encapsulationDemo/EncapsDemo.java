package encapsulationDemo;

class Human{
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public void display() {
		System.out.println(name+" : "+age);
	}
	
}


public class EncapsDemo {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.setName("Indu");
		h1.setAge(35);
		
		Human h2= new Human();
		h2.setName("Sunil");
		h2.setAge(40);
		
		h1.display();
		h2.display();
		

	}

}
