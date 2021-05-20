package stream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Prac07_range {

	public static void main(String[] args) {
		//for(int i=12; i<18; i++) syso
		IntStream.rangeClosed(12, 18).forEach(System.out::print);
		
		List<Board> dummy = new ArrayList<>();
		IntStream.rangeClosed(1, 100).forEach(i -> {
			dummy.add(new Board( i, "title_"+i, "name_"+i, LocalDateTime.now()));
		});
		dummy.stream().forEach(System.out::println);
	
	}

}

@AllArgsConstructor
@Data
class Board {
	private int no;
	private String title;
	private String name;
	LocalDateTime createdate;
	
}
