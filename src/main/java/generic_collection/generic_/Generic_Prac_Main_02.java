package generic_collection.generic_;

// 자료형을 Object로 선언하여 prac_01 문제를 해결 

public class Generic_Prac_Main_02 {
	
	public static void main(String[] args) {
		Generic_Prac_03<String> name = new Generic_Prac_03<String>();
		Generic_Prac_03<Integer> age = new Generic_Prac_03<Integer>();
		
		name.setT("ss");
		age.setT(15);
		
		System.out.println(name.getT());
		System.out.println(age.getT());
	}
}

