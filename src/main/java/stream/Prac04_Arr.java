package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Prac04_Arr {

	public static void main(String[] args) {
		//가변인자도 지원해주는 of() 메서드 
		
		String[] str1 = {"a", "b", "c"};
		String[] str2 = {"인", "학"};
		
		Stream<String[]> strm1 = Stream.of(str1, str2);
		
		Stream.of(str1,str2).forEach(x -> System.out.println(Arrays.deepToString(x)));
		
		Stream<String> strm2 = strm1.flatMap(Arrays::stream);
		strm2.forEach(System.out::println);
	}

}

