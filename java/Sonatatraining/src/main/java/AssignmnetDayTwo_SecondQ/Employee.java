package AssignmnetDayTwo_SecondQ;

public abstract class Employee {
	int empId,numofLeaves;
	String empName;
	double basicPay;
	Address_Emp address = new Address_Emp();
	public abstract double calculateSalary();
}