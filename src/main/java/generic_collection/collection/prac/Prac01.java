package generic_collection.collection.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import lombok.var;

public class Prac01 {

	public static void main(String[] args) {
		List<String> a = new ArrayList();
		a.add("at");
		a.add("as");
		a.add("as");
		
		var b = new HashSet<String>();
		b.addAll(a);
		
		var c = new TreeSet<String>();
		c.addAll(a);
		c.forEach((String x) -> System.out.println(x));
		System.out.println("---");
		b.forEach((String x) -> System.out.println(x));
		System.out.println("----");
		a.forEach((String x) -> System.out.println("1"+x));
		
		Iterator<String> it1 = a.iterator();
		while(it1.hasNext()) {
			System.out.println("2"+it1.next());
		}
		
		Iterator<String> it2 = a.iterator();
		it2.forEachRemaining((n) -> System.out.println(n));
		
		Iterator<String> it3 = a.iterator();
		it3.forEachRemaining(System.out::println);
		
		Collections.sort(a);
		System.out.println(a.toString());
	}

}
