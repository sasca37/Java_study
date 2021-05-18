package lamda_;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Lamda_16_UnaryOperator {

	public static void main(String[] args) {
			//Function 은 매개변수와 반환 자료형을 각 정의 
		Function<String, String> sourceFile = p -> p + ".java";
		
		//UnaryOperator는 하나로 정의
		UnaryOperator<String> classFile = p -> p + ".class";
		
		System.out.println(sourceFile.apply("Sample"));
		System.out.println(classFile.apply("Sample"));
	}
	// 매개변수가 두개일 경우는 BiFunction, BiPredicate 등을 사용, 다만 Unary는 BinaryOperator사용 

}
