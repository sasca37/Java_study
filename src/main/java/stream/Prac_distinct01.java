package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Prac_distinct01 {

	public static void main(String[] args) {
		var list = Arrays.asList(1,2,3,2,1,5);
		System.out.println(list.toString());
		
		System.out.println("Hashset을 이용한 중복 제거");
		var<Integer> list2 = new ArrayList(new HashSet<Integer>(list));
		list2.forEach(System.out::println);
		
		System.out.println("-------------");
		list.stream().distinct().forEach(System.out::println);
	}

}
