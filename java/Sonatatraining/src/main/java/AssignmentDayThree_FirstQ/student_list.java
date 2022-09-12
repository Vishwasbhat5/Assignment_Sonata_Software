package AssignmentDayThree_FirstQ;
import java.util.LinkedList;
import java.util.List;
public class student_list {
	public List<student>addStudents(){
		List<student> std= new LinkedList<student>();
		std.add(new student(100,"vishwas",11));
		std.add(new student(200,"rohit", 21));
		std.add(new student(300,"SSR", 38));
		std.add(new student(400,"guru", 49));
		return std;
	
	}
}

