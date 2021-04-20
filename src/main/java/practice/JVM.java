package practice;

public class JVM {
/*
 메모리영역 
 1. 코드실행영역
 
 2. Static 영역 : 패키지, 클래스, static 키워드 (클래스, 메소드영역이라고도함)
 -> 실제로 호출될때 메모리에 올라가며 jvm이 종료될 때까지 사라지지(static)않음
 
 3. Stack 영역 :  {를 만날 떄마다 스택 프레임 쌓이고 }를 만나면 사라짐 
 -> 기본형 타입 변수의 값들은 stack에 저장 
 
 4. Heap 영역 
 -> 생성된 객체 (인스턴스)들이 올라감 
 */
public static void main(String[] args) {
	int k=0;
	int j=0;
	for(int i=0; i<10; i++) {
	
		k++;
	}
	System.out.println(j);
}
}
