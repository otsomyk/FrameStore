package car;

public class Catalog {
	Car carCatalog[] = new Car[10];

	Car car1 = new Car(Model.RENAULT, Colour.WHITE, 2012, 1.6);
	Car car2 = new Car(Model.MAZDA, Colour.DARK_BLUE, 2011, 1.6);
	Car car3 = new Car(Model.FORD, Colour.BLACK, 2014, 3.0);
	Car car4 = new Car(Model.TESLA, Colour.GREEN, 2015, 0.0);
	Car car5 = new Car(Model.AUDI, Colour.RED, 2010, 1.6);

	public void fillCatalog() {
		carCatalog[0] = car1;
		carCatalog[1] = car2;
		carCatalog[2] = car3;
		carCatalog[3] = car4;
		carCatalog[4] = car5;
	}

	public void addNewCar(Car car) {
		for (int i = 0; i < carCatalog.length; i++) {
			if (carCatalog[i] == null) {
				carCatalog[i] = car;
				break;
			}
		}
	}

	public void availableCar() {
		for (int i = 0; i < carCatalog.length; i++) {
			if (carCatalog[i] != null) {
				System.out.println(carCatalog[i].getModel() + ", Price: "
						+ carCatalog[i].getPrice());
			}
		}
	}

	public Car[] getCarCatalog() {
		return carCatalog;
	}

	public void setCarCatalog(Car[] carCatalog) {
		this.carCatalog = carCatalog;
	}
}