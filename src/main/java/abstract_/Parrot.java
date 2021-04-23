package abstract_;

public class Parrot extends Pet {
	
	public Parrot(boolean wing, int legCount) {
		super(wing, legCount);
	}
	
	public void run(String name) {
		System.out.printf("%s는 뜁니다" , name);
	}
	
	public void fly(String name) {
		System.out.printf("%s는 뛰지않고 날라갑니다.", name);
	}
}

 class Cat extends Pet {
	public Cat(boolean wing, int legCount) {
		super(wing, legCount);
	}
	
	public void run(String name) {
		System.out.printf("%s는 날라갑니다.", name);
	}
}

 