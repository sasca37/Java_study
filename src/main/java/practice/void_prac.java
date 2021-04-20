package practice;

class Data {
	int value;
	
	void setValue(int value) {
		this.value = value;
	}
	int getvalue() {
		return value;
	}	
}

public class void_prac {
	public static void main(String[] args) {
		Data data = new Data();
		data.setValue(10);
		System.out.println(data.getvalue());
	}
}
	
