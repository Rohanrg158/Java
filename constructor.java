class Student{
	String name;
	int rollNumber;
	int m1, m2, m3;
	float avg;
	Student(int rollNumber, String name, int m1, int m2, int m3){
		this.rollNumber = rollNumber;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void calculateAverage() {
		avg = (m1+m2+m3)/3;
	}
	public void displaydetails() {
		System.out.println("Name:"+name);
		System.out.println("Roll number:"+rollNumber);
		System.out.println("Mark1:"+m1+"\tMark2:"+m2+"\tMark3:"+m3);
		System.out.println("Average:"+avg);
	}
}
public class constructor {
	public static void main(String[] args) {
		System.out.println("Student 1:");
		Student Student1 = new Student(13, "Alan", 65, 77, 67);
		Student1.calculateAverage();
		Student1.displaydetails();
		System.out.println("Student 2:");
		Student Student2 = new Student(14, "A", 70, 75, 69);
		Student2.calculateAverage();
		Student2.displaydetails();
	}
}
	
