package encapsulationDemo;

class Humans{
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void display() {
		System.out.println(name+" : "+age);
	}
	
}
public class encapsUsingThis {

	public static void main(String[] args) {
		Humans h1 = new Humans();
		h1.setName("Indu");
		h1.setAge(35);
		
		Humans h2= new Humans();
		h2.setName("Sunil");
		h2.setAge(40);
		
		h1.display();
		h2.display();
	}

}
