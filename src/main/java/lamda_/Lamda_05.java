package lamda_;

import java.util.function.Supplier;

import lombok.RequiredArgsConstructor;


//참조 자료형으로 클래스를 만들어 클래스의 멤버변수에서 생성자를 통해 값을 받고 매개변수로 람다식을 이용하여 멤버 변수의 내용을 출력 
public class Lamda_05 {

	public static void main(String[] args) {
		MessageCenter mc = new MessageCenter("Hello");
		MessageCenter main = getMsg(() -> mc);
		System.out.println(main);
	
	}
	
	public static MessageCenter getMsg(Supplier<MessageCenter> mc) {
		return mc.get();
	}

}

@RequiredArgsConstructor
class MessageCenter {
	private final String msg;

	@Override
	public String toString() {
		return msg;
	}
	
	
}