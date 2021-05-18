package lamda_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lamda_14 {
	
	//isEqual()메서드 :  람다식에 특정값을 넣어 비교, 같으면 T 아니면 F 
	public static void main(String[] args) {
		//로또 당첨번호 5, 12, 25, 26, 38, 45 / 23
		
		List<Integer> luckyNo = Arrays.asList(5, 12, 25, 26, 38, 45);
		Predicate<List<Integer>> isLucky = Predicate.isEqual(luckyNo);
		
		List<Integer> myNo = Arrays.asList(5, 12, 25, 26, 38, 45);
		
		if(isLucky.test(myNo)) {
			System.out.println("당첨");
		}
		else {
			System.out.println("미당첨");
		}
	}

}
