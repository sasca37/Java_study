package practice
;

public class 배열 {

	public static void main(String[] args) {
		String a1 = "abcd";
		//toCharArray() 스트링을 char 배열에 넣는 함수 
		char[] a2 = a1.toCharArray();
		System.out.println(a2[0]);
		
		/*메서드 
		Array.toString() : 배열의 내용을 문자열로 반환 
		Arrays.deepToString() : 다중 배열의 내용을 문자열로 반환 
		Arrays.equal() : 배열 비교 
		Arrays.deepEquals() : 다중 배열 비교 
		Arrays.copyOf() : 배열 복사 및 길이설정 가능 object , from, to 
		Arrays.sort() : 배열 오름차순 정렬
		*/	
		
		int [][][] student = new int [3][3][12];
		student[1][0] = new int[9]; // 2학년 1반 9명 
		student[1][2] = new int[10]; // 2학년 3반 10명 
		student[2][0] = new int[7];
		student[2][2] = new int[11];
		System.out.println(student[0][1].length);
		
	}

}
