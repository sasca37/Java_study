package generic_collection.generic_;

//import lombok.AllArgsConstructor;
import lombok.Getter;

public class Generic_Prac4_01 {

	public static void main(String[] args) {
		Student<Integer, Integer> yong = new Student<Integer, Integer>(1,4);
		yong.printInfo("영");
		Student<Integer, Double> yong2 = new Student<>(1,4.2);
		yong2.printInfo("아");

	}

}

@Getter
//@AllArgsConstructor
class Student<G, C> {
	G g;
	C c;
	
	public void printInfo(String name) {
		System.out.println(name + "은(는) " + g +"학년" + c + "반 ");
	}

	public Student(G g, C c) {
		//super();
		this.g = g;
		this.c = c;
	}
	
}