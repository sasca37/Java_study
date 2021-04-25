package generic_collection.generic_;

// 자료형을 Object로 선언하여 prac_01 문제를 해결 

public class Generic_Prac_Main_01 {
	
	public static void main(String[] args) {
		Generic_Prac_02 obj = new Generic_Prac_02();
		obj.setA("ㅋㅋ");
		Generic_Prac_02 obj2= new Generic_Prac_02();
		obj2.setA(12);
		
		//object의 형변환 필요  
		String name = (String)obj.getA();
		int age = (int)obj2.getA();
		
		System.out.printf("%s는 %d살 ", name, age);
	}
}

