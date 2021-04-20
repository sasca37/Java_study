package practice;
/*
 메모리영역
 - 스태틱 : 주로 클래스들이 할당, 가비지컬렉션 관여x, 모든 객체가 메모리 공유
 - Heap : 주로 객체들이 할당. 가비지컬렉션o, 메모리공유 x
 */
class Number {
	static int num = 0; //클래스 필드
	int num2 = 0; //인스턴스 필드
}
public class Static_prac {

	public static void main(String[] args) {
		Number n1 = new Number(); 
		Number n2 = new Number(); 
		n1.num++; //클래스 필드 1증가
		n1.num2++; //인스턴스 필드 1증가
		System.out.println(n2.num); 
		System.out.println(n2.num2);
	}

}
