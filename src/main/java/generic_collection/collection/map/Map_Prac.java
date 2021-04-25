package generic_collection.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Prac {

	public static void main(String[] args) {
		// 키 , 벨류 존재이기 때문에 2개의 자료형이 필요하다.
		var map = new HashMap<String, Integer>(); 
		map.put("java", 1);
		map.put("c", 2);
		map.put("c", 2);
		map.put("c++", 3);
		
		Map beforeMap = (Map) map.clone();
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key);
		}
		
		for(String a : map.keySet()) {
			System.out.println(a);
		}
	}

}
