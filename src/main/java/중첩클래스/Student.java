package 중첩클래스;

public class Student {

	public static void main(String[] args) {
		Ins tt = new Ins("ㅅㅅ");
		Ins.Score  tt2= tt.new Score();
		tt2.eng =23;
		tt2.mat=20;
		tt2.showInfo();
	}

}
