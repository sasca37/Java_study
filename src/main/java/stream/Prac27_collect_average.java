package stream;

import java.util.stream.IntStream;


public class Prac27_collect_average {
	
	public static void main(String[] args) {
		//ifPresent: 메소드에 값이 있는지 확인, 있으면 출력 
		IntStream.rangeClosed(1, 100).average().ifPresent(System.out::println);
		// intStream을 사용했기때문에 int형으로 반환되므로 getAsDouble을 이용하여 더블형으로 값을 반환 한다.
		double avg = IntStream.rangeClosed(1, 100).average().getAsDouble();
		System.out.println(avg);
	}	

}


