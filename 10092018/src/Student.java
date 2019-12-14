
public class Student {
	int sid;
	String sname;
	
	Student (int studentId, String studentName){
		sid=studentId;
		sname= studentName;
	}
	public void displayStudentDetails() {
		System.out.println(sid+" " +sname);
	}

	public static void main(String[] args) {
		Student s1= new Student(102, "Durga");
		s1.displayStudentDetails();
		

	}

}
