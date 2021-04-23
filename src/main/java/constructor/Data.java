package constructor;

public class Data {
	String name;
	int age;
	
	public Data() {
		//매개 변수 가 없을 경우 설정 가능 (물론 다른 생성자에 설정이 되어있어야됨)
		this("무명", 0);
	}
	public Data(String name, int age) {
		System.out.println("Data 초기화합니다.");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
}
