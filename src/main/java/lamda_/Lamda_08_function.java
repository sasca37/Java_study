package lamda_;

import java.util.function.Function;

public class Lamda_08_function {

	public static void main(String[] args) {
			// Function : 1개의 매개변수, 결과반환 o 
		Function<Integer, String> f = (i) -> {
			return switch(i) {
				case 1 -> "one";
				case 2 -> "two";
				case 3 -> "th";
				case 4 -> "fo";
				case 5 -> "fi";
				default -> throw new IllegalArgumentException("Unexpectedvalue : " + i);
			};
		};
		
		System.out.println(f.apply(3));
	}
}
