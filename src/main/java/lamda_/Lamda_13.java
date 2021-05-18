package lamda_;

import java.util.function.Predicate;

public class Lamda_13 {

	public static void main(String[] args) {
		//10보다 크고 20보다 작은 수, and 연산자 조건식두개 & 
		int a = 12;
		int b = 33;
		
		Predicate<Integer> isMin = s -> s > 10;
		Predicate<Integer> isMax = s -> s < 20;
		
		System.out.println(isMin.and(isMax).test(a));
		System.out.println(isMax.and(isMin).test(b));
	}

}
