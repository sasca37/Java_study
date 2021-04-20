package practice;

import java.util.Random;

public class 난수생성 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(3)+1; // 1~3 출력
		System.out.println("난수 : " +num );
		double num2 = random.nextDouble(); // 1~3 출력
		System.out.println("난수2 : " +num2 );

	}

}
