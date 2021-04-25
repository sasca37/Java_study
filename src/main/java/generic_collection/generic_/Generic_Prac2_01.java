package generic_collection.generic_;


class Computer <T extends ComputerPart> {
	private T component;
	
	public Computer() {} 

	public T getComponent() {
		return component;
	}

	public void setComponent(T component) {
		this.component = component;
	}
	
	public void toInfo() {
		System.out.println(component.getClass().getName());
	}
	
	
}

class ComputerPart{}

class Graphics extends ComputerPart {}

class Memory extends ComputerPart {} 

class Monitor {}

public class Generic_Prac2_01 {

	public static void main(String[] args) {
			Computer<ComputerPart> vga = new Computer<ComputerPart>();
			vga.setComponent(new Graphics());
			//vga.setComponent(new Monitor()); Computerpart를 상속 받지 않아서 제한됨 
			vga.toInfo();
			
			//Computer<ComputerPart> mem = new Computer<>(new Memory());
			//mem.toInfo();
	}

}