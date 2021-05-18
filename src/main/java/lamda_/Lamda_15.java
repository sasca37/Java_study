package lamda_;

import java.util.Scanner;
import java.util.function.Predicate;

public class Lamda_15 {
		//negate 반대 값을 반환 
	public static void main(String[] args) {
		Predicate<Integer> isOdd = s -> (s % 2 ) == 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수 입력");
		sc.hasNextInt();
		System.out.println(isOdd.negate().test(sc.nextInt()));
		
		// not 메서드를 사용하여 짝수를 구하는 람다식 생성  
		Predicate<Integer> isEven = Predicate.not(isOdd); 
		
		//or 메서드 
		int [] no = {1, 3, 6, 8};
		Predicate<Integer> isMultiple = s -> (s % 3) == 0;
		
		for(int num : no) {
			if(isOdd.or(isMultiple).test(num)) {
				System.out.printf("%d는 홀수이거나 3의 배수 ", num);
			}
		}
	}

}
