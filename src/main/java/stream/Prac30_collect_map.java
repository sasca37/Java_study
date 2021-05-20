package stream;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

public class Prac30_collect_map {
	
	public static void main(String[] args) {
		//boxed : 매핑 작업. 중간처리 기능으로 스트림의 요소를 다른요소로 대체하는 작업 
		List<Integer> list = IntStream.rangeClosed(1, 10).map(x -> x * 2).boxed().collect(toList());
		System.out.println(list);
	}	

}


