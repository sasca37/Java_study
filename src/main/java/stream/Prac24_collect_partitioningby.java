package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Prac24_collect_partitioningby {
	
	public static void main(String[] args) {
		
		List<Score> scores = Arrays.asList(
				new Score("a", 61, 71,71),
				new Score("b", 62, 72,82),
				new Score("c", 63, 74,55)
				);
		
		//수학 80점 이상인 사람과 그렇지 않은 사람 구분
		Map<Boolean, List<Score>> result = scores.stream().collect(Collectors.partitioningBy(s -> {
			return (s.getMat() > 80)? true : false;
		}));
		System.out.println("수학 80점이상 ");
		List<Score> list = result.get(true);
		for(Score score: list) {
			System.out.println(score.getName());
		}
		
		//수학 80점 이상인 사람과 그렇지 않은 사람 몇명? 
		Map<Boolean, Long> count = scores.stream().collect(Collectors.partitioningBy(s -> {
			return (s.getMat() > 80)? true:false;
		}, Collectors.counting()));
		System.out.printf("80점 이상인사람은 %d명" , count.get(true));
		
	}

}

