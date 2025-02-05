package misellanious.interview.questions;

class Shape{
	public double calculateArea(){
		return 0.0;
	}	
}

class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}


class Rectangle extends Shape{
	private double length, breadth;
	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double calculateArea() {
		return length*breadth;
	}
}



public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		Shape sh= new Circle(5.5);
		Shape sha= new Rectangle(2.5, 1.5);
		System.out.println(sh.calculateArea());
        System.out.println(sha.calculateArea());
	}

}
