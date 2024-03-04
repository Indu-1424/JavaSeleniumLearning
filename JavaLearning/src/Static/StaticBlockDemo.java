package Static;

class Mobile1{
	
	int price;
	String brand;
	static String name;
	
	public Mobile1(){
		price=500;
		brand=" ";
	}
	
	static {
		name="phone";
	}
	
	public void show() {
		System.out.println(brand+": "+price+": "+name);
	}
}

public class StaticBlockDemo {

	public static void main(String[] args) {
		
		Mobile1 mob1= new Mobile1();
		mob1.brand="Apple";
		mob1.price=1500;
		mob1.show();
		
		
		Mobile1 mob2= new Mobile1();
		mob2.brand="nokia";
		mob2.show();
		
		Mobile1 mob3=new Mobile1();
		mob3.brand="Samsung";
		mob3.price=1000;
		mob3.show();

	}

}
