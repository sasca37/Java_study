package stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Prac16_collect {
	
	//unmodifiableList : 컬렉션 클래스(List, Map,Set 등)를 수정할 수 없는 상태로 반환시킴 
	public static void main(String[] args) {
		List<String> G7 = Stream.of("미국", "영국", "프랑스", "독일", "이탈리아").collect
				(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		
		System.out.println(G7);
		G7.add("대한민국");
	}

}

