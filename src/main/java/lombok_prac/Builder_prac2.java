package lombok_prac;

import java.util.Arrays;

import lombok.Builder;
import lombok.ToString;

public class Builder_prac2 {

	public static void main(String[] args) {
		Member[] members = new Member[3];
		members[0] =  Member.builder().name("ㅁㅁ").age(14)	.build();
		members[1] = Member.builder().name("ㅁㅁ2").age(34).build();
		members[2]= Member.builder().name("ㅁㅁ3").age(44)	.build();
		
		System.out.println(Arrays.deepToString(members));
	}

}
//@ToString(exclude = "name")
@ToString
class Member {
	String name;
	int age;
	
	@Builder
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
