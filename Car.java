package car;

public class Car {

	private Model model;
	private int year;
	private Colour colour;
	private double engineCapacity;
	private double price;
	private int count;

	public Car(Model model, Colour colour, int year, double engineCapacity) {
		this.colour = colour;
		this.model = model;
		this.year = year;
		this.engineCapacity = engineCapacity;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public Model getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public Colour getColour() {
		return colour;
	}

	public double getengineCapacity() {
		return engineCapacity;
	}

	public void printInfo() {
		System.out.println("Model: " + this.model + "; Colour: " + this.colour
				+ "; Year: " + this.year + "; Engine Capacity: "
				+ this.engineCapacity);

	}
	
}
