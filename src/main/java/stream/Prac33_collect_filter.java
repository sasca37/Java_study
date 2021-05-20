package stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prac33_collect_filter {
	
	public static void main(String[] args) {
		// 2개의 배열
		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
		
		List<Integer> list3 = Stream.of(list1, list2).flatMap(List::stream).filter(x -> x % 3 == 0).collect(Collectors.toList());
		
		System.out.println(list3);
	}	

}


