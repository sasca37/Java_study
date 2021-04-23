package object;

public class ObjectArray {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("aa", 21, 1);
		students[1] = new Student("ab", 41, 3);
		students[2] = new Student("ac", 11, 2);
		
		for(Student student: students) {
			System.out.println(student.toString());
		}
	}
}

class Student {
	String name;
	int age;
	int grade;
	
	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
    
}
