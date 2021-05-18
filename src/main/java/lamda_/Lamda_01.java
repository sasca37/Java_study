package lamda_;

public class Lamda_01 {

	public static void main(String[] args) {
		//Sample01Function의 test가 인자가없어 () 만사용하고 반환자료형이 void 형이므로 반환값 없이 print만 사용 
		// (매개변수) -> 실행문 
		Sample01Function f = () -> System.out.println("샘플테스트 출력");
		f.test();
	}

}

//한개의 추상메서드를 갖고있는 함수형 인터페이스에서는 추가적인 추상메서드가있으면 오류가 발생하기 때문에 규칙을잘 지켜야한다.
@FunctionalInterface
interface Sample01Function {
	public abstract void test(); // 한개의 추상메서드 
}
