package labwork1;

public class Main {

	public static void main(String[] args) {
		Vehicle motorcycle = new Vehicle(2, "Black", 300, "87"); //A motorcycle vehicle
		Car car = new Car(4, "Silver", 2000, "87", "Mitsubishi"); //A car
		
		//testing getters for motorcycle
		System.out.println("Test 1:");
		System.out.println(motorcycle.getEngineSize());
		System.out.println(motorcycle.getFuelType());
		System.out.println(motorcycle.getNumberOfWheels());
		System.out.println(motorcycle.getColor());
		
		//testing setter for motorcycle and displaying if the change worked
		System.out.println("Test 2:");
		motorcycle.setColor("Pink");
		System.out.println(motorcycle.getColor());
		
		//testing getters for car
		System.out.println("Test 3:");
		System.out.println(car.getEngineSize());
		System.out.println(car.getFuelType());
		System.out.println(car.getNumberOfWheels());
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
		
		//testing setters for car and displaying if changes worked
		System.out.println("Test 4:");
		car.setColor("Blue");
		car.setBrand("Tesla");
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
		
		//testing other car methods
		System.out.println("Test 5:");
		car.honk();
		car.displayInfo();
	}

}
