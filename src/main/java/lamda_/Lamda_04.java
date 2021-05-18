package lamda_;

public class Lamda_04 {

	public static void main(String[] args) {
		
		Sample s = new Sample( ) {
			@Override
			public String test(int count) {
				String test = "tt";
				for(int i =0; i<count; i++) {
					System.out.println(test);
				}
				return test;
			}
		};
		s.test(3);

	
	
	Sample s2 = (t) -> {
		String test = "tt2";
		for(int i=0; i<t; i++) {
			System.out.println(test);
		}
		return test;
	};
	s2.test(3);
}
}

interface Sample {
	public abstract String test(int count);
}