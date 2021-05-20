package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Prac09_stream {

	public static void main(String[] args) {
		//toArray()
		
		//Stream을 활용하여 1부터 100까지 배열 생성 
		int[] numbers = IntStream.rangeClosed(1, 100).toArray();
		//Stream 활용 배열 출력
		Arrays.stream(numbers).forEach(System.out::print);

		//forEach() 
		System.out.println();
		Stream.of("a" , "b", "c").forEach(name -> System.out.print(name));
		System.out.println();
		Arrays.asList("a", "b","c").stream().forEach(name -> System.out.print(name));
		
		//forEachOrdered() 병렬 처리시 순서 보장이 안돼서 순서를 보장받기 위한 메서드 
		List<Integer> list = Arrays.asList(2,4,6,8,10);
		
		System.out.println("직렬스트림 foreach");
		IntStream.rangeClosed(65, 69).forEach(x -> System.out.println((char)x));
		
		System.out.println("병렬 스트림 foreach");
		IntStream.rangeClosed(65, 69).parallel().forEach(x -> System.out.println((char)x));
		
		System.out.println("병렬 스트림 forEachOrdered");
		IntStream.rangeClosed(65, 69).parallel().forEachOrdered(x -> System.out.println((char)x));
	}

}

