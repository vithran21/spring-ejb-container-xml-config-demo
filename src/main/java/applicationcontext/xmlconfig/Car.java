package applicationcontext.xmlconfig;

public class Car {
	String name;
	double price;
	String color;
	
	public Car() {
//		this.name = "BMW";
//		this.price = 2122.00;
//		this.color = "Yellow";
	}
	
	public Car(String name, double price, String color) {
		this();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
}
