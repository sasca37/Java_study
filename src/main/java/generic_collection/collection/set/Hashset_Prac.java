package generic_collection.collection.set;

import java.util.HashSet;

public class Hashset_Prac {
	//Hash는 순서가 없고, 중복을 허용하지 않는다.
	public static void main(String[] args) {
		var hs = new HashSet<String>();
		hs.add("tt3");
		hs.add("tt");
		hs.add("tt");
		hs.add("tt2");
		hs.forEach(System.out::println);
	}

}
