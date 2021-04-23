package lombok_prac;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

public class Builder_Main {
	public static void main(String[] args) {
		Person2 p1 = new Person2.Person2Builder()
				.no(1)
				.build();
		Person2 p2 = new Person2.Person2Builder()
				.no(2)
				.name("ab")
				.phone("11")
				.build();
		Person2 p3 = new Person2.Person2Builder()
				.no(3)
				.name("ac")
				.build();
		System.out.println(p3.getName() + p3.getNo() + p3.getPhone() );
	}
	
}
@Getter
@Setter
@RequiredArgsConstructor
class Person2 {
	private final int no;
	private String name;
	private String phone;
	
	@Builder
	public Person2(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	
}