package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Prac22_collect_groupingby {
	
	public static void main(String[] args) {
		
		List<Score> scores = Arrays.asList(
				new Score("a", 61, 71,71),
				new Score("b", 62, 72,82),
				new Score("c", 63, 74,55)
				);
		
		Map<String, List<Score>> result = scores.stream().collect(Collectors.groupingBy( s -> {
			return (s.getMat() > 90) ? "A" : 
						(s.getMat() > 80) ? "B" : 
						(s.getMat() > 70) ? "C" : 
						(s.getMat() > 60) ? "D" : "F";
  		}));
		result.keySet().forEach(key -> {
			System.out.printf("수학 %s 학점 \n", key);
			List<Score> score = result.get(key);
			score.stream().forEach(s -> System.out.println(s.getName()));
		});
		
				
	
	}

}

