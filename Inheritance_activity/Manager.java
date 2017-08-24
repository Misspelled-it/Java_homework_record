package test.javapro;

public class Manager extends Employee{

	protected Manager(long Id, String name, String address, long phone, double salary) {
		super(Id, name, address, phone);
		this.basicSalary= salary;
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 15*this.basicSalary/100;
		System.out.println(transportAllowance);
	}
}
