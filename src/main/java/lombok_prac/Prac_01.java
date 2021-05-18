package lombok_prac;

public class Prac_01 {

	public static void main(String[] args) {
		System.out.println(concat("지","우으","기"));
	}

	public static String concat(String... a) {
		String result = "";
		for(String k : a) {
			result += k;
		}
		return result;
	}
}
