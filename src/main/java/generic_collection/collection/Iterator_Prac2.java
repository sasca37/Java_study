package generic_collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Iterator_Prac2 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("lion");
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
			if("cat".equals(item)) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
