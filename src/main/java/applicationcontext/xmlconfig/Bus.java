package applicationcontext.xmlconfig;

public class Bus {

	String name;
	double price;
	String color;

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}
