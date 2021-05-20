package stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Prac12_reduce {

	public static void main(String[] args) {
			int sum1 =0;
			OptionalInt sum2;
			
			sum1 = IntStream.rangeClosed(7, 10).reduce(6, Integer::sum);
			System.out.println("int 반환 reduce 문 결과 : "+ sum1);
			
			sum2 = IntStream.rangeClosed(6, 10).reduce(Integer::sum);
			System.out.println(" sum2 " + sum2.getAsInt());
			
			OptionalInt sum3 = OptionalInt.empty();
			if(sum3.isEmpty()) {
				System.out.println("sum3 값 비었");
			}
			sum3 = OptionalInt.of(6);
			
			if(sum3.isPresent()) {
				System.out.println(sum3);
			}
			else {
				System.out.println("값없다");
				IntStream.rangeClosed(6, 10).reduce(Integer::sum).ifPresent(System.out::println);
			}
	}

}

