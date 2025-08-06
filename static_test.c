package pious_1st;
class Student{
	String name;
	static int studentCount = 0;
	public Student(String name) {
		this.name = name;
		studentCount++;
	}
	public static int getStudentCount() {
	       return studentCount;
	   }
}
public class student_details {
	public static void main(String[] args) {
		Student student1 = new Student("Rohan");
		Student student2 = new Student ("John");
		Student student3 = new Student ("Aiwin gay");
		System.out.println("Total number of students: " + Student.getStudentCount());
	}
}
