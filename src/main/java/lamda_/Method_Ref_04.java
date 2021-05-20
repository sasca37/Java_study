package lamda_;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

import lombok.Getter;

public class Method_Ref_04 {
	/*
	   	메소드 참조 : 정확히 매개변수를 추론할 수 있다면 메서드 참조를 할 수 있습니다.
	   	1. static 메서드 참조
	   	2. 특정 개체의 인스턴스 메서드 참조
	   	3. 특정 타입의 임의 개체에 대한 인스턴스 메서드 참조
	   	4. 생성자 참조 
	   	 
	   	4. 생성자 참조 (Object name)::new
	   	new Object();  new 키워드를 이요한 생성자 호출,  () -> new Object() // 람다식을 이용한 생성자호출, Object::new 생성자 참조
	 */
	
	public static void main(String[] args) {
		Supplier<Name> supplier1 = () -> new Name();
		Name name1 = supplier1.get();
		System.out.println("람다" + name1.getName());
		
		Supplier<Name> supplier2 = Name::new;
		Name name2 = supplier2.get();
		System.out.println("생성자 참조"+name2.getName());
		
		//ex2
		BiConsumer<Integer, Integer> plus1 = (a, b) -> new Plus(a, b);
		plus1.accept(3, 5);
		
		BiConsumer<Integer, Integer> plus2 = Plus::new;
		plus2.accept(3, 4);
	}

}

@Getter
class Name {
	private String name;
	
	public Name() {
		this.name= "빵";
	}
}

class Plus {
	public Plus(int a, int b) {
		System.out.println((a+b));
	}
}