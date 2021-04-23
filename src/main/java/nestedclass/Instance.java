package nestedclass;
/* 1. 인스턴스 내부 클래스 
 중첩클래스 : 클래스 내부에 클래스가 있는 경우 (외부클래스의 멤버 클래스로 멤버 변수와 같은 레벨 )*/

public class Instance {

	String name;
	public Instance(String name) {
		this.name = name;
	}
	public class Score {
		int eng;
		int mat;
			
			public void showInfo() {
				System.out.println("이름 : " + name);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + mat);
	
			}
	}
}
