package test.javapro;

public class Trainee extends Employee{

	protected Trainee(long Id, String name, String address, long phone, double salary) {
		super(Id, name, address, phone);
		this.basicSalary= salary;
	}
}

