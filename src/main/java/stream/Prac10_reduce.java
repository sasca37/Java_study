package stream;

import java.util.stream.IntStream;

public class Prac10_reduce {

	public static void main(String[] args) {
		//reduce ( int형 초기값, ( int형 인자1 , int형 인자2)) 
		int sum1 = 0;
		int sum2 = 0;
		for (int i=6; i<=10; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		sum2 = IntStream.rangeClosed(7, 10).reduce(6, Integer::sum);
		System.out.println(sum2);
		
	}

}

