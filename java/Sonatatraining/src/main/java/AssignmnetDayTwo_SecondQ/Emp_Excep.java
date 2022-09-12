package AssignmnetDayTwo_SecondQ;

public class Emp_Excep {

	public static void main(String[] args) throws Self_Excep
	{
		int yearlySalary = 300001;
		if(yearlySalary<300000)
		{
			throw new Self_Excep("Salary is less than 300000");
		}
		else 
		{
				System.out.println("Salary is not less than 300000");
			}
	}
}