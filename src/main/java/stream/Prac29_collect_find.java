package stream;

import java.util.Arrays;
import java.util.List;


public class Prac29_collect_find {
	
	public static void main(String[] args) {
		//순차적이아닐경우(병렬스트림)의 findany의 요소값이 바뀔수있다. 순차적일경우는 값이 첫번째 요소로 고정 
		// findAny : 순서와 상관없이 조건에 맞는 첫요소 , findFirst : 요소중 첫번째  
		List<Integer> list = Arrays.asList(4, 6, 2, 8, 10);
		//요소 중에서 제일 먼저 찾은 요수를 얻는다.
		list.stream().findAny().ifPresent(System.out::println);
		
		//요소 중에서 첫 요소를 찾아서 얻는다.
		list.stream().findFirst().ifPresent(System.out::println);
		
		list.stream().filter(x -> x > 2).findAny().ifPresent(System.out::println);
		
		list.parallelStream().filter(x -> x > 2).findAny().ifPresent(System.out::println);
		
		list.stream().filter(x -> x > 2).findFirst().ifPresent(System.out::println);
		
		list.parallelStream().filter(x -> x > 2).findFirst().ifPresent(System.out::println);
	}	

}


