package nestedclass;
//3. 익명 내부클래스 - 즉석에서 클래스를 만들어 사용 
// 아직 알려진 클래스가 없기때문에 익명, 일반적으로 추상 클래스나, 인터페이스의 메서드 대체용으로 사용 

interface Bow {
	public String sayHello();
	public String sayBye();
}

public class AnonymousMain3 {

	public static void main(String[] args) {
		
		final String name ="a";
		Bow bow = new Bow() {
			public String sayHello() {
				return name + "ㅎ";
			}

			public String sayBye() {	
				//내부 클래스 내에서 this를 사용 
				System.out.println(this.sayHello());
				return name +"zz";
			}
		};
		System.out.println(bow.sayBye());
	}
}
