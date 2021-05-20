package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Prac15_collect {

	public static void main(String[] args) {
		//collectingAndThen(): 다른자료형으로 변환하여 반환한 후에 추가 작업 cAT(Collector<T,A,R> downstream, Function<R,RR> finisher) 
		//reverse() 
		List<String> locals = Arrays.asList("서울", "대전", "대구", "광주", "부산", "제주");
		List<String> reversedLocals = locals.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
				city -> {
					//역정렬 
					Collections.reverse(city);
					return city.stream();
				})).collect(Collectors.toList());
		System.out.println(locals.toString());
		System.out.println(reversedLocals.toString());
	}

}

