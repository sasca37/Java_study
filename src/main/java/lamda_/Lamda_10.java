package lamda_;

import java.util.function.Function;

public class Lamda_10 {

	public static void main(String[] args) {
		
		//문자열 -> 숫자
		Function<String, Integer> work = s -> {
				System.out.println("- 입력된 문자열을 숫자로 변환.");
				return Integer.parseInt(s);
		};
		
		//숫자 -> 문자 
		Function<Integer, String> after = i -> {
			System.out.println(" - 입렵된 숫자를 문자열로 변환");
			return "" + i;
		};
		
		System.out.println("문자열 123을");
		
		if(work.andThen(after).apply("123") instanceof String) {
			System.out.println("STRING 입니다");
		}
		else {
			System.out.println("String이 아닙니다");
		}
	}

}
