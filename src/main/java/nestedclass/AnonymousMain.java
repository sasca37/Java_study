package nestedclass;
//3. 익명 내부클래스 - 즉석에서 클래스를 만들어 사용 
// 아직 알려진 클래스가 없기때문에 익명, 일반적으로 추상 클래스나, 인터페이스의 메서드 대체용으로 사용 
public class AnonymousMain {

	public static void main(String[] args) {
		
		//Runnable이라는 인터페이스를 자료형으로 r이라는 인스턴스 객체 생성 
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("익명 내부 클래스 실행");
			}			
		};
		r.run();

	}

}
