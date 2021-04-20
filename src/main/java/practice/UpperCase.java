package practice;

import java.util.Scanner;

/**
 * @author sasca
 *
 */
public class UpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.printf("입력한 값 :%s\n 글자수 : %d\n", in.toUpperCase().trim(), in.toUpperCase().trim().length() );
	}

}
