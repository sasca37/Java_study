package nestedclass;
//3. 익명 내부클래스 - 즉석에서 클래스를 만들어 사용 
// 아직 알려진 클래스가 없기때문에 익명, 일반적으로 추상 클래스나, 인터페이스의 메서드 대체용으로 사용 

interface Greeting {
	public String sayHello(String name);
}

public class AnonymousMain2 {

	public static void main(String[] args) {
		Greeting greeting = new Greeting() {
			public String sayHello(String name) {
				return name + " 안녕 !";
			}
		};
		
		System.out.println(greeting.sayHello("Zz"));

	}

}
