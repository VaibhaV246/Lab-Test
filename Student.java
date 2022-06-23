package lab8;

public class Student {
	
	 int roll;
	 String Student_name;
	 String subject;
	 int marks;
	 
	public Student(int roll, String student_name, String subject, int marks) {
		super();
		this.roll = roll;
		Student_name = student_name;
		this.subject = subject;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", Student_name=" + Student_name + ", subject=" + subject + ", marks=" + marks
				+ "]";
	}

	
}
