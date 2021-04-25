package generic_collection.generic_;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Generic_Prac4_02{

	public static void main(String[] args) {
		Student1<Integer,Integer>  tt= new Student1<>(1,5);
		tt.toInfo("앙");
		//Student1<Integer,Double>  tt2= new Student1<>(1,5);

	}

}


@AllArgsConstructor
@Getter
//타입 제한 
class Student1<G extends Integer, C extends Integer> {
	G g;
	C c;
	
	public void toInfo(String name) {
		System.out.printf("%s는 %d학년 %d반", name, g,c);
	}
}