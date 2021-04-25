package interface_;

public class Prac_02_default {

	public static void main(String[] args) {
			Villa a = new Villa();
			float area = a.compute(30);
			System.out.printf("빌라 면적 %f\n", area);
			
			area = a.toPyung(area);
			System.out.println(area);
	}

}

class Villa implements IExcute {

	public float compute(int area) {
		return area * pyung;
	}

	
}

abstract interface IExcute {
	float pyung = 3.3f;
	float compute(int area);
	//접근제어자의 default가 아닌 디폴트 메서드의 default이다. 
  default float toPyung(float area) {
		return area / pyung; 
	}
}

