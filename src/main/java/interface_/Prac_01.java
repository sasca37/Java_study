package interface_;

public class Prac_01 {

	public static void main(String[] args) {
		ICompute a = new Apartment();
		float area = a.compute(30);
		System.out.printf("아파트의 면적은 %f 제곱미터", area);
	}

}

class Apartment implements ICompute{

	public float compute(int area) {
		//pyung++; 에러 ! 
		return area * pyung;
	}

}

abstract interface ICompute{
	float pyung = 3.3f; //static final 로 컴파일 
	float compute(int area); 	//추상 메서드로 처리  abstract float~ 
	//float toPyung(int area); 추상메서드 추가시 번거로움발생

}
