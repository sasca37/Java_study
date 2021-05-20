package stream;

import java.util.Arrays;
import java.util.List;


public class Prac28_collect_match {
	
	// allMatch , anyMatch, noneMatch
	public static void main(String[] args) {
		List<Score> scores = Arrays.asList(
				new Score("a", 61, 71,71),
				new Score("b", 62, 72,82),
				new Score("c", 63, 74,55)
				);
		
		boolean result1 = scores.stream().anyMatch(x -> x.getMat() > 39);
		System.out.println("수학 과락이 아닌사람 T/F " + result1);
		
		boolean result2 = scores.stream().allMatch(x -> x.getKor() > 39);
		System.out.println("국어 과락없나요" + result2);
		
		boolean result3 = scores.stream().noneMatch(x -> x.getEng() > 39);
		System.out.println("영어 모두 과락?" + result3);
	}	

}


