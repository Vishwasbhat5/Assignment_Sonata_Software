package AssignmentDay3_1stquestion;

public class UsingEmployee {

	public static void main(String[] args) {
		Manager_Employee m1 = new Manager_Employee(12345, "Manager's Name", 350);
		Developer d1 = new Developer(22839, "Vishwas Bhat", 200);
		Tester_Employee t1 = new Tester_Employee(54321, "Tester Name", 300);
		m1.display();
		d1.display();
		t1.display();
	}
}