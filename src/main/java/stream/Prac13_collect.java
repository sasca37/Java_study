package stream;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;


public class Prac13_collect {

	public static void main(String[] args) {
		String[] animals = { "토끼", "호랑이", "고양이", "강아지", "고양이"};
		
		System.out.println("기본 배열 출력 ");
		System.out.println(Arrays.deepToString(animals));
		
		System.out.println("리스트로 변환후 출력");
		List<String> list = Arrays.stream(animals).collect(toList());
		System.out.println(list.toString());
		
		System.out.println("set 변환 후 출력 (중복 제거)");
		Set<String> list2 = list.stream().collect(toSet());
		System.out.println(list2.toString());
		
		System.out.println("Treeset");
		Set<String> list3 = list2.stream().collect(toCollection(TreeSet::new));
		System.out.println(list3.toString());
		
		//toMap(key, value, mergeFunction( 중복값이 있을경우처리)
		System.out.println("HashMAP");
		Map<String, Integer> list4 = list.stream().collect(toMap(Function.identity(), String::length, (x1,x2) -> x1 + x2));
		System.out.println(list4.toString());
	}

}

