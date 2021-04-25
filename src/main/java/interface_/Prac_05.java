package interface_;

public class Prac_05 {

	public static void main(String[] args) {
		//일반 클래스의 메서드도 상속받아서 재구현할 수 있다.
		String legacyKey = Util.getRandom();
		System.out.printf("레거시 시스템에서 처리될 키값은 %s입니다. \n\n", legacyKey );
		
		for(int i=0; i< 5; i++) {
			//일반 클래스의 메서드도 상속받아서 재구현할 수 있다.
			String key = Util.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s \n\n", key);
		}
	}

}

class Util {
	//클래스 상속을 위해 static 메서드로 선언 
	public static String getRandom() {
		return "" + (int)(Math.random() * 10 + 1);
	}
}
