package stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Stream;

public class Prac05_Collection {

	public static void main(String[] args) {
		
		var list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		var list2 = new HashSet<Integer>();
		list2.add(3);
		list2.add(3);
		list2.add(5);
		list2.add(5);
		list2.add(6);
		list2.add(6);
		
		var t = new ArrayList();
		t.add(3);
		t.add("Ast?");
		for(var k : t) {
			System.out.println(k);
		}
		Stream<?> tt = t.stream();
		tt.forEach(System.out::println);
		
		//스트림생성 
		Stream<String> arrStrm1 = list1.stream();
		Stream<Integer> arrStrm2 = list2.stream();
		
		// 스트림을 이용한 출력 
		arrStrm1.forEach(System.out::println);
		arrStrm2.forEach(System.out::println);
		
		// 컬렉션에서 스트림을 이용한 출력 
		list1.stream().forEach(System.out::println);
		list2.stream().forEach(System.out::println);
	}

}

