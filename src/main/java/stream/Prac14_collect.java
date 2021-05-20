package stream;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.Map;


public class Prac14_collect {

	public static void main(String[] args) {
		String[][] level = { {"a", "b"}, {"c", "d"}, {"E","Z"}};
		Map map  = Arrays.stream(level).collect(toMap(x -> x[0], x -> x[1]));
		System.out.println(map.toString());
		
		
		//중복된 값이 있을경우 x + "," +y로 처리하도록 mergeFunction을 설정 
		String[][] level2= { {"a", "b"}, {"a", "d"}, {"E","Z"}, { "d", "e"}};
		Map map2  = Arrays.stream(level2).collect(toMap(x -> x[0], x -> x[1], (x,y) -> x + "," + y));
		System.out.println(map2.toString());
	}

}

