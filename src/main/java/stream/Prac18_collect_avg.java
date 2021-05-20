package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Prac18_collect_avg {
	
	public static void main(String[] args) {
		List<Score> scores = Arrays.asList(
					new Score("a", 61, 71,81),
					new Score("b", 62, 72,82),
					new Score("c", 63, 74,85)
				);
		
		double averageMat = scores.stream().collect(Collectors.averagingInt(Score::getKor));
		System.out.println(averageMat);
		
	}

}

@Data
@RequiredArgsConstructor
class Score {
	private final String name;
	private final int kor;
	private final int eng;
	private final int mat;
	private String msg;
}
