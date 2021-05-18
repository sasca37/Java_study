package lamda_;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Lamda_07_forEach {

	public static void main(String[] args) {
		//ArrayList forEach() API : ()안에서 Consumer함수가 돌며 지정된 작업 수행 
		List<Employee1> emp = Arrays.asList(
				new Employee1(1, "a", 1400),
				new Employee1(2, "b", 2400),
				new Employee1(3, "c", 3400),
				new Employee1(4, "d", 4400)
				);
		System.out.println(" == 연봉 2배 인상 == ");
		emp.forEach((x) -> {
			x.setSalary(x.getSalary() * 2);
			System.out.println(x);
		});
		
	}
}

@Data
@AllArgsConstructor
class Employee1 {
	private int no;
	private String name;
	private double salary;
}
