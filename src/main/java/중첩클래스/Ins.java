package 중첩클래스;
// 중첩클래스 : 클래스 내부에 클래스가 있는 경우 
// 1. 인스턴스, 지역, 익명, 정적 
public class Ins {
//1. 인스턴스 중첩 내부 클래스 
	String name;
	public Ins(String name) {
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
