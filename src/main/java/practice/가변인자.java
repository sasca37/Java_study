package practice;

public class 가변인자 {
	// 가변인자는 1개만 가능 , 인자가 여러개일 경우 항상 마지막에 가변인자를 넣어야한다.
	public static int total = 0;
	public static void main(String[] args) {
		System.out.printf("결과 :  %d%n", sum(1,2,3));
		System.out.printf("결과 :  %d", sum(1,2,3,4,5,6));
		
		
	}
	
	public static int sum(int ...a) {
		int[] var4 = a;
		int var3 = a.length;
		
		for(int var2 =0; var2 < var3; var2++) {
			int i = var4[var2];
			total += i;
		}
		return total;
	}
}

