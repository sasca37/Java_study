package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prac20_collect_join {
	
	public static void main(String[] args) {
		// joining : 스트림 요소들을 하나로 조합하는 메서드 , 매개변수가 없으면 스트림 요소들끼리 조합하여 그 값을 반환
		List<String> list = Arrays.asList("py", "java", "c");
		
		//단순조합
		String a = list.stream().collect(Collectors.joining());
		System.out.println(a);
		
		String b = list.stream().collect(Collectors.joining(","));
		System.out.println(b);
		
		//구분자 , 접두사, 접미사 세개의 결과를 조합하여 출력
		String c = list.stream().collect(Collectors.joining(",", "프로그래밍 언어에는 " , " 등이 있습니다"));
		System.out.println(c);
	}

}

