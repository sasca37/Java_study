package nestedclass;

/*2. 지역 클래스 
-> 클래스 안에 메서드가 있고 그 메서드안에 내부 클래스가 들어있는 형태*/
public class LocalMain {
	
	void localMethod() {
		final int age = 23;
		
		class LocalClass {
			public void howOldAreYou() {
				System.out.printf("%d살", age);
			}
		}
		
		LocalClass innerClass = new LocalClass();
		innerClass.howOldAreYou();
	}
	
	public static void main(String[] args) {
		LocalMain outer = new LocalMain();
		outer.localMethod();

	}

}
