package labwork1;

public class Car extends Vehicle{
	private String brand;
	
	public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
		super(numberOfWheels, color, engineSize, fuelType);
		this.brand = brand;
	}

	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	//prints honks to the display
	public void honk() {
		System.out.println("Honk, honk!");
	}
	
	//displays the field values of the car
	public void displayInfo() {
		System.out.println("Color: " + this.getColor() + ". Engine Size:" + this.getEngineSize() + 
				". Fuel Type: " + this.getFuelType() + ". # of wheels: " + this.getNumberOfWheels() + ". Brand: " + this.brand + ".");
	}
}
