package stream;

import java.util.stream.Stream;

public class Prac06_null {

	public static void main(String[] args) {
		//null을 반환하지 않고 요소가 없는 스트림(Stream.empty())을 반환하는 예제 
		String[] arr = null; 
		// Stream<String> stream = Stream.of(arr); 널포인터 에러발생
		Stream<Object> stream = Stream.of((arr == null ? Stream.empty(): arr));
	}

}

