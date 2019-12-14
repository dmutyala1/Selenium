
public class Student2 {
	
	int sid;
	String sname;
	static String collegeName = "DNR";
	
	//static variable example//
	
	Student2(int studentId, String studentName){
		sid = studentId;
		sname = studentName;
		
	}
	
	

	public void displayStudentDetails(){
		System.out.println(sid+"     "+sname+"    "+collegeName);
		
		

	}
	public static void main(String[] args){
		
		Student2 s1 = new Student2(101, "Durga");
		s1.displayStudentDetails();
		
		Student2 s2 = new Student2 (102, "Bhavani");
		s2.displayStudentDetails();
	}

}
