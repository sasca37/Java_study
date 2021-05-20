package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Prac19_collect_count {
	
	public static void main(String[] args) {
		List<FreeBoard> list = Arrays.asList(
					new FreeBoard(1, "가입인사", "ㅎㅇ"),
					new FreeBoard(2, "가입인사", "ㅎㅇ2"),
					new FreeBoard(3, "가입인사", "ㅎㅇ3")
				);
		
		List<FreeBoard> reversedList = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), contents -> {
			Collections.reverse(contents);
			return contents.stream();
		})).collect(Collectors.toList());
		
		long cnt = list.stream().collect(Collectors.counting());
		reversedList.stream().forEach(System.out::println);
		System.out.println(cnt);
	}

}

@Data
@AllArgsConstructor
class FreeBoard {
	private int no;
	private String title;
	private String contents;	
}