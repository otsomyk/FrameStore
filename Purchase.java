package car;

public class Purchase {
	private Car car;
	private Customer customer;
	private String information;

	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar(){
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public void todayTransactionList(){
		System.out.println();
	}

}
