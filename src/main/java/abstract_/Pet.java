package abstract_;

// run 에서 abstract를 선언했기 때문에 class앞에 abstract 붙임 ( 한개 이상일 시 클래스에 붙임)
public abstract class Pet {
	private boolean wing; //날개 여부 
	private int legCount; // 다리 개수 
	
	public String isWing() {
		String str;
		if(this.wing) str = "날 수 있다.";
		else str="날 수 없다.";
		
		return str;
	}
	
	public int getLegCount() {
		return legCount;
	}
	//이 클래스를 상속받으면 꼭 구현해야되는 생성자 
	public Pet(boolean wing, int legCount) {
		this.wing = wing;
		this.legCount = legCount;
	}
	//추상 메서드 끝에 ; 
	public abstract void run(String name);
}
