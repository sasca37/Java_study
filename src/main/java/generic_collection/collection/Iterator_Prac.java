package generic_collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterator_Prac {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println("1. forEach");
		list.forEach((String x) -> System.out.println(x));
		
		System.out.println("4. Iterator");
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("5. Iterator 활용한 람다식");
		Iterator<String> it2 = list.iterator();
		it2.forEachRemaining((n) -> System.out.println(n));
		
		System.out.println("6. Iterator 활용 (참조 메서드활용)");
		Iterator<String> it3 = list.iterator();
		it3.forEachRemaining(System.out::println);
		
		System.out.println("7. Collection 정렬 ");
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.toString());
	}

}
