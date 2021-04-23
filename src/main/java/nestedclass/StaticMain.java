package nestedclass;

public class StaticMain {

	public static void main(String[] args) {
		StaticClass.Score score = new StaticClass.Score("GAS");
		score.eng = 23;
		score.mat = 21;
		
		score.showInfo();

	}

}
