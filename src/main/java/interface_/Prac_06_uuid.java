package interface_;

import java.util.UUID;

public class Prac_06_uuid {

	public static void main(String[] args) {
		String legacyKey = LagacyUtil.getRandom();
		System.out.printf("레거시 시스템에서 처리될 키값은 %s입니다. \n\n", legacyKey );
		
		for(int i=0; i< 5; i++) {
			//일반 클래스의 메서드도 상속받아서 재구현할 수 있다.
			String key = NewUtil.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s \n\n", key);
		}
	}

}

class LagacyUtil {
	public static String getRandom() {
		return "" +(int) (Math.random() * 10 + 1);
	}
}

class NewUtil extends Util {
	public static String getRandom() {
		return "" + UUID.randomUUID();
	}
}