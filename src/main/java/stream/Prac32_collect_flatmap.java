package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac32_collect_flatmap {
	
	public static void main(String[] args) {
		//Stream<String[]> : [{ "" "" "" } , { "" "" }] 
		//flatMap() : { "" "" "" "" "" }
		// Collectorts.toList() : [ " " "" "" "" ""]
		
		
		//flatMap : 여러개의 스트림을 모두 합쳐서 하나의 스트림으로 만듬 	
		//2개의 스트링 배열
		String[] str1 = {"빵형", "상도", "타노스"};
		String[] str2 = {"a", "b"};
		//2개의 String 배열을 스트림으로 만든다 . {{},{}}
		Stream<String[]> strm = Stream.of(str1, str2);
		List<String> list = strm.flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
		System.out.println(list.toString());
	}	

}


