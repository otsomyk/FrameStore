package car;

public class Customer {
	private String name;
	private String adress;
	private String phone;
	private int numberInList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberInList() {
		return numberInList;
	}

	public void setNumberInList(int numberInList) {
		this.numberInList = numberInList;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printCustomerInfo() {
		System.out.println(numberInList + "Customer name: " + name + ", adress: " + adress + ", phone: "
				+ phone);
	}
	
}
