public class Emp{
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}

	void display(){
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args){
		Address address1 = new Address("Mamou", "MG", "Guinea");
		Address address2 = new Address("Kankan", "HG", "Guinea");

		Emp e1 = new Emp(001, "Diallo", address1);
		Emp e2 = new Emp(002, "Kaba", address2);

		e1.display();
		e2.display();
	}
}