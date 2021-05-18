package lombok_prac;

import java.util.Arrays;

import lombok.Builder;
import lombok.Data;

public class Prac_02 {
	// 이름과 나이를 멤버필드로 갖는 Member 클래스 작성후 빌더로 3명정보를 배열에 등록 후 출력
	public static void main(String[] args) {
		Memberw[] m = new Memberw[3];
		m[0] = Memberw.builder().name("a").age(15).build();
		m[1] = Memberw.builder().name("b").age(16).build();
		m[2] = Memberw.builder().name("c").age(17).build();
		System.out.println(Arrays.deepToString(m));
	}
}

@Builder
@Data
class Memberw {
	private String name;
	private int age;
}
