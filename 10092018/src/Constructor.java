
public class Constructor {

	int sid;
	String sname;
	int age;
	
	Constructor (int studentId, String studentName){
		sid=studentId;
		sname= studentName;
	}
	Constructor(int studentId, String studentName,int studentAge){
		sid=studentId;
		sname= studentName;
		age = studentAge;
	}
		
	public void displayStudentDetails() {
		System.out.println(sid+" " +sname+"  " +age);
	}

	public static void main(String[] args) {
		Constructor s1= new Constructor(101, "Durga");
		s1.displayStudentDetails();
		
		Constructor s2= new Constructor(102, "Sam", 35);
		s2.displayStudentDetails();
}
}
