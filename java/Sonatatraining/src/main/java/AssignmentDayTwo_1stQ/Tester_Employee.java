package AssignmentDayTwo_1stQ;

public class Tester_Employee extends Employee {
	double yearlySal;
	Tester_Employee() {}
	Tester_Employee(int id, String name, double sal) {
		super.empId = id;
		super.empName = name;
		super.empSal = sal;
	}
	public void display() {
		System.out.print(" - Tester Details - \nEmployee ID - " + empId + "\nEmployee Name - " + empName + "\nMonthly Salary - " + empSal + "\nYearly Salary - ");
		salCal();
	}
	public void salCal() {
		yearlySal = 12 * empSal;
		System.out.println(yearlySal + "\n");
	}
}