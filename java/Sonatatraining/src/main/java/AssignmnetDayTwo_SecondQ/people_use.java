package AssignmnetDayTwo_SecondQ;

public class people_use {

	public static void main(String[] args) {
		
		//Technical Employee Instance
		Tech_Emp t1 = new Tech_Emp(22803, "Vishwas S B", "JAVA", 25000, 5);
		Address_Emp tAdd = new Address_Emp(194, "Basavangudi", "Bengaluru", 560004);
		t1.address = tAdd;
		
		//Staff
		Staff s1 = new Staff(54321, "Staff Name", "Emp_Title", 12000, 2);
		Address_Emp sAdd = new Address_Emp(194, "Basavangudi", "Bengaluru", 560004);
		s1.address = sAdd;
		
		//Display all details
		System.out.println(t1);
		System.out.println("\n\n" + s1);
	}
}