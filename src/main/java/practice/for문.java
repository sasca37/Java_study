package practice;

import java.util.Arrays;

public class for문 {
	public static void main(String[] args) {
		/*
		    JAVA SE : C언어의 표준인 C9, C11처럼, JAVA의 표준 문법을 의미 (JAVA SE 11, 12 등)
			JAVA EE : JAVA SE에 엔터프라이즈용 여러 기능(라이브러리 등)을 포함한 확장 버전
			JRE : Java Runtime Environment (JAVA 버전에 따른 기본 라이브러리 포함)
			JVM : Java Virtual Machine (자바 코드를 해석해서 프로그램을 실행해주는 가상 머신)
		continue : break와 달리 반복문의 처음으로 돌아와 증감식을 이어서한다.
		 for(;;) : 무한반복 
		 */
		
		// jdk 1.5 부터 향상된 for문 사용가능
		String[] friends = {"Dooly", "chulSoo", "Dabi"};
		for(String a : friends) {
			System.out.print(a+"\n");
		}
		System.out.println(Arrays.toString(friends));
	}

	
}
