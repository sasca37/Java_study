package lamda_;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Method_Ref_03 {
	/*
	   	메소드 참조 : 정확히 매개변수를 추론할 수 있다면 메서드 참조를 할 수 있습니다.
	   	1. static 메서드 참조
	   	2. 특정 개체의 인스턴스 메서드 참조
	   	3. 특정 타입의 임의 개체에 대한 인스턴스 메서드 참조
	   	4. 생성자 참조 
	   	 
	   	3. 특정 타입의 임의 개체에 대한 인스턴스 메서드 참조
	 */
	
	public static void main(String[] args) {
		var list = Arrays.asList( new Person(1, "a")
												, new Person(2, "b")
												, new Person(3, "c")
												, new Person(4, "d"));
		
		System.out.println("람다식 ");
		list.forEach(x -> x.toObjString());
		System.out.println("메서드참조");
		list.forEach(Person::toObjString);
		
	}
	
}


@Getter
@Setter
@AllArgsConstructor
class Person {
	private Integer no;
	private String name;
	
	public void toObjString() {
		System.out.println(no +"/"+ name);
	}
}


