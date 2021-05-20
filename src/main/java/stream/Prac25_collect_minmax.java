package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Prac25_collect_minmax {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,4,7,56,43,99);
		Integer minNumber = list.stream().min(Integer::compare).get();
		System.out.println("최솟값: " + minNumber);
		
		List<Score> scores = Arrays.asList(
				new Score("a", 61, 71,71),
				new Score("b", 62, 72,82),
				new Score("c", 63, 74,55)
				);
		
		scores.stream().collect(Collectors.minBy(Comparator.comparing(Score::getMat))).ifPresent(System.out::println);
		
		scores.stream().min(Comparator.comparing(Score::getMat)).ifPresent(System.out::println);
		
		Score maxMathScore = scores.stream().max(Comparator.comparing(Score::getMat)).get();
		System.out.println("최고 수학점수 사람: " + maxMathScore);
		
	}

}


