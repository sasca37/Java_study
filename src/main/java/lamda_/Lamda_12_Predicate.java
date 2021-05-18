package lamda_;

import java.util.Scanner;
import java.util.function.Predicate;

public class Lamda_12_Predicate {
	//1개의 매개변수 T와 boolean 반환 자료형을 갖는 함수형 인터페이스
	public static void main(String[] args) {
		
		Predicate<Integer> isOdd = s -> (s % 2) == 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수입력");
		//키보드로부터 입력된 값이 숫자이면 true 아니면 false를 반환 
		sc.hasNextInt();
		//test 메서드로 출력 
		System.out.println(isOdd.test(sc.nextInt()));
	}

}
