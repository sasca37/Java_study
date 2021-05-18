package lamda_;

import java.text.DecimalFormat;
import java.util.function.Function;

public class Lamda_09 {

	public static void main(String[] args) {
		int myMoney = 100000;
		
		//10퍼 세금
		Function<Integer, Integer> work = (money) -> {
			System.out.println("납부 " + (int)(money * 0.1));
			return money = (int) (money * 0.9);
		};
		//수입금 합 
		Function<Integer, Integer> before = (income) -> {
			System.out.println("수입" + income);
			return income;
		};
		
		myMoney = work.apply(myMoney);
		printInfo(myMoney);
		// 수입 찍고, 납부찍고 , 잔액처리를 위한 compose 사용 
		myMoney += work.compose(before).apply(30000);
		printInfo(myMoney);
	}
	
	public static void printInfo(int myMoney) {
		DecimalFormat df = new DecimalFormat("##, ###, ###");
		System.out.println("잔액 : "+ df.format(myMoney));
	}
}
