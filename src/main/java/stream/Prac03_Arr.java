package stream;

import java.util.Arrays;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Prac03_Arr {

	public static void main(String[] args) {
		DataObj[] data = {new DataObj(1,"a"), new DataObj(2, "b"), new DataObj(3,"c")};
		
		//스트림 생성 후 바로 출력도 가능
		Arrays.stream(data).forEach(System.out::println);
		
		//클래스를 이용한 참조자료형은 Stream객체의 제네릭 타입 ㅣㅇ용하여 사용 
		Stream<DataObj> stm = Arrays.stream(data);
		stm.forEach(System.out::println);
		
		System.out.println();
		
		
	}

}

@AllArgsConstructor
@Data
class DataObj {
	int no;
	String name;
}