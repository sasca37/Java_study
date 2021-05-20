package stream;

import java.util.Arrays;
import java.util.List;

public class Prac31_collect_map {
	
	public static void main(String[] args) {
		//map : 스트림요소 하나하나에 연산한 결과를 그대로 반환할경우에 사용
		
		List<Score> scores = Arrays.asList(
				new Score("a", 61, 71,71),
				new Score("b", 52, 42,42),
				new Score("c", 63, 74,35)
				);
		
		scores.stream().map(x -> {
			if(x.getKor() < 40 || x.getEng() < 40 || x.getMat() < 40) {
				x.setMsg("과락");
			}
			else if((x.getKor() + x.getEng() + x.getMat()) / 3 < 60) {
				x.setMsg("불합");
			}
			else {
				x.setMsg("합격");
			}
			return x;
		}).forEach(System.out::println);;
	}	

}


