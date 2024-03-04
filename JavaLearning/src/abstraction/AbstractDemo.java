package abstraction;

abstract class Car{
	public void drive() {
		System.out.println("driving");
	}
	public abstract void playMusic();
	public abstract void acMechanisim();
}

class Maruti extends Car{

	public void playMusic() {
		System.out.println("Playing Music");
	}

	public void acMechanisim() {
		System.out.println("Switch on AC");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Car car = new Maruti();
		car.drive();
		car.playMusic();
		car.acMechanisim();
	
		

	}

}
