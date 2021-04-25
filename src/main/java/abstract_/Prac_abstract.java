package abstract_;

import java.util.Arrays;

public class Prac_abstract {

	public static void main(String[] args) {
		Data tt = new AscData();
		tt.setData(1,2,3,6,4);
		tt.sort();
		System.out.println(tt.toString());
	}

}

abstract class Data {
	Integer[] data; 
	
	public void setData(Integer ...data) {
		this.data = data;
	}
	
	public abstract void sort();

	@Override
	public String toString() {
		return "Data [data=" + Arrays.toString(data) + "]";
	}
	
}

class AscData extends Data {
	@Override
	public void sort() {
		Arrays.sort(data);
	}
}


