package lamda_;

import java.util.Arrays;
import java.util.List;

public class Method_Ref_01 {
	/*
	   	메소드 참조 : 정확히 매개변수를 추론할 수 있다면 메서드 참조를 할 수 있습니다.
	   	1. static 메서드 참조
	   	2. 특정 개체의 인스턴스 메서드 참조
	   	3. 특정 타입의 임의 개체에 대한 인스턴스 메서드 참조
	   	4. 생성자 참조 
	   	 
	   	 기본문법 : (Object name) :: (Method name)
	 */
	
	public static void main(String[] args) {
		//1. 스태틱 메서드 참조
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.forEach(Writer::doWrite);
		list.forEach(x -> Writer.doWrite(x));
	}

}

class Writer {
	public static void doWrite(Object msg) {
		System.out.println(msg);
	}
}
