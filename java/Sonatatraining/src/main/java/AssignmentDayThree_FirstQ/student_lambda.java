package AssignmentDayThree_FirstQ;
import java.util.List;
public class student_lambda {
	public List<student>marksSort(){
		List<student>std=new student_list().addStudents();
				System.out.println(" According to marks,has been sorted");
				std.sort((student s1, student s2)->s1.getMarks()-s2.getMarks());
				
				return std; 
			 }
			
			
			public List<student>nameSort(){
				System.out.println("Sorted According to name");
			List<student>std1=new student_list().addStudents();
			 std1.sort((student n1, student n2)->n1.getStdName().compareTo(n2.getStdName()));
			return std1; 
		 }
			
		public static void main (String args[]) 
			{
				System.out.println(new student_lambda().marksSort());
				System.out.println(new student_lambda().nameSort());
			}
		}
