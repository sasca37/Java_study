package lamda_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class Lamda_06_consumer {

	public static void main(String[] args) {
		//Consumer는 1개의 매개변수가 있지만 반환할 자료형이 없습니다.(void)
			Consumer<String> c = x -> {
				System.out.println(x.toUpperCase()+"ㅎ");
			};
			c.accept("Consumer");
	
	
	List<Employee> emp = Arrays.asList(
			new Employee(1, "ㅎㅁ", 1),
			new Employee(21, "ㅎㄴ", 2),
			new Employee(13, "ㄱㅎ", 3),
			new Employee(14, "ㄴㅎ", 4)			
			);
	
	Consumer<Employee> consumer = x -> {
		x.setSalary(x.getSalary() * 2);
	};
	
	doubleSalary(emp, consumer.andThen(System.out::println));
}
	private static void doubleSalary(List<Employee> emp, Consumer<Employee> f) {
		for(Employee a : emp) {
			f.accept(a);
		}
	}
}
@Builder
@Data
@AllArgsConstructor
class Employee {
	private int no;
	private String name;
	private double salary;
}