package test.javapro;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance;
	double Hra;
	protected Employee(long Id, String name, String address, long phone){
		this.employeeId = Id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.specialAllowance = 250.80;
		this.Hra = 1000.50;
	}
	public void calculateSalary() {
		double salary;
		salary = this.basicSalary + (this.basicSalary * (this.specialAllowance/100)) + (this.basicSalary * (this.Hra/100));
		System.out.println(salary);
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 10*this.basicSalary/100;
		System.out.println(transportAllowance);
	}
}
