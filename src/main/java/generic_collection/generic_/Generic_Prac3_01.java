package generic_collection.generic_;

class Computer1 {
	//클래스 타입에서 제네릭을 사용하지 않아서 타입 사용할 수 없음 
	private String componentClassName;
	
	public void toInfo() {
		System.out.println(componentClassName);
	}
	
	//생성자에 제네릭 타입을 선언
	public <T extends ComputerPart>Computer1(T component) {
		this.componentClassName = component.getClass().getName();
	}
	
}
class ComputerPart1 {} 

class Memory1 extends ComputerPart {} 

public class Generic_Prac3_01 {

	public static void main(String[] args) {
		//생성자를 통한 객체 생성 ( 입력되는 타입이 제한됨)
		Computer1 mem = new Computer1(new Memory1());
		mem.toInfo();
	}

}
