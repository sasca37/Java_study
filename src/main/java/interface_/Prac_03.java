package interface_;

public class Prac_03 {
	
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.study();
		Person2 p2 = new Person2();
		p2.teach();
		Person3 p3 = new Person3();
		p3.study();
		p3.teach();
	}
}

interface Student {
	void study();
}

interface Teacher{
	void teach();
}

class  Person1  implements Student {
	@Override
	public void study() {
		System.out.println("Person1이 공부한다.");
	}
}

class Person2 implements Teacher {
	@Override
	public void teach() {
		System.out.println("Person2가 가르친다.");
	}
}

class Person3 implements Student, Teacher {
	@Override
	public void teach() {
		System.out.println("Person3가 가르친다.");
	}

	@Override
	public void study() {
		System.out.println("Person3가 공부한다.");
	}
}
