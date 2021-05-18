package lamda_;

public class Lamda_03 {

	public static void main(String[] args) {
		
		//람다식 
		Runnable r = () -> System.out.println("익명 내부클래스를 람다식으로 실행 ");
		r.run();
		
		//익명내부클래스 
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
					System.out.println("익명 내부클래스 ");
			}
		};
		r2.run();
		
	}

}
