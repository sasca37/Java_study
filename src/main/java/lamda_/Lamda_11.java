package lamda_;

import java.util.function.Function;

public class Lamda_11 {
	
	//static으로 실행되는 메서드인 identity()  
	// 매개변수가 1개이고 반환이필요시 Function, 매개변수가 1개이고 반환이 void이면 Consumer사용 
	public static void main(String[] args) {
		Function<Integer, Integer> fun = Function.identity();
		System.out.println(fun.apply(100));
	
	}

}
