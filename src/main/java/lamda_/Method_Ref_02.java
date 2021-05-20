package lamda_;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Method_Ref_02 {
	/*
	   	메소드 참조 : 정확히 매개변수를 추론할 수 있다면 메서드 참조를 할 수 있습니다.
	   	1. static 메서드 참조
	   	2. 특정 개체의 인스턴스 메서드 참조
	   	3. 특정 타입의 임의 개체에 대한 인스턴스 메서드 참조
	   	4. 생성자 참조 
	   	 
	   	2. 특정 개체의 인스턴스 메서드 참조
	 */
	
	public static void main(String[] args) {
		//2. 특정 개체의 인스턴스 메서드 참조
		String greeting = "Hello";
		//Consumer  : 매개변수가 1개고 반환자료형은 없는 함수형 인터페이스 
		Consumer<String> consumer = System.out::println; //static 메서드 참조 
		consumer.accept(greeting);
		
		writeString(greeting::toString);
		
		// ex2 
		Math math = new Math();
		BiFunction<Integer, Integer, Integer> minus1 = (a, b) -> math.minus(a,b);
		BiFunction<Integer, Integer, Integer> minus2 = math::minus;
		
		System.out.println("람다식" + minus1.apply(5, 2));
		System.out.println("메서드 참조" + minus2.apply(5, 2));
	}
	public static void writeString(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}
}

class Math {
	//2개의 인자를 갖고 int형 반환형을 갖는 메서드 
	public int minus(int a, int b) {
		return a - b;
	}
}


