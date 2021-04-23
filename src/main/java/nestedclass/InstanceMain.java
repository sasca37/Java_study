package nestedclass;

public class InstanceMain {

	public static void main(String[] args) {
		Instance tt = new Instance("ㅅㅅ");
		Instance.Score  tt2= tt.new Score();
		tt2.eng =23;
		tt2.mat=20;
		tt2.showInfo();
		
	}

}
