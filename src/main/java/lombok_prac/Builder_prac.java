package lombok_prac;

import lombok.RequiredArgsConstructor;

public class Builder_prac {

	public static void main(String[] args) {
		Person p1 = new Person(1);
		Person p2 = new Person(2, "a");
		//Person p3 = new Person(3, "aa", "111");
		// 추가적으로 생성자 호출해줘야되서 불편 
	}

}

@RequiredArgsConstructor
class Person {
	private final int no;
	private String name;
	private String phone;
	
	public Person(int no, String name) {
	this.no = no;
	this.name = name;
	}
}
