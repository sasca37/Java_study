package stream;

import java.util.stream.IntStream;


public class Prac26_collect_sum {
	
	public static void main(String[] args) {
		int sum1 = IntStream.rangeClosed(1, 100).boxed().reduce(0, (a,b) -> a + b);
		System.out.println(sum1);
		
		int sum2 = IntStream.rangeClosed(1, 100).boxed().reduce(0, Integer::sum);
		System.out.println(sum2);
		
		//skip  : 처음10개를 무시 
		int sum3 = IntStream.rangeClosed(1, 100).skip(10).sum();
		System.out.println(sum3);
	}	

}


