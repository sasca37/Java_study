package lamda_;

public class Lamda_02 {

	public static void main(String[] args) {

		//람다식 
		Sample02Function a = (n) -> System.out.println(n);
		a.test("ta");
		
		//익명 내부클래스 버전
		Sample02Function b = new Sample02Function() {
			@Override
			public void test(String name) {
				System.out.println(name);
			}
		};
		b.test("tt");
	}

}

@FunctionalInterface
interface Sample02Function {
	public abstract void test(String name); // 한개의 추상메서드 
}
