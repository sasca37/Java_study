package interface_;

import java.util.Arrays;
import java.util.Comparator;

public class Prac_prac01 {

	public static void main(String[] args) {
		Data asc = new Asc();
		asc.setData(1,2,5,3,4);
		asc.sort();
		System.out.println(asc.toString());
		
		Data desc = new Desc();
		desc.setData(1,2,5,3,4);
		desc.sort();
		System.out.println(desc.toString());
	}

}

abstract class Data {
	public abstract void sort();
	Integer[] data;
	
	public void setData(Integer... data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return  Arrays.toString(data);
	}
}
class Asc extends Data{
	@Override
	public void sort() {
		Arrays.sort(data);
	}
	
}

class Desc extends Data{
	@Override
	public void sort() {
		Arrays.sort(data, Comparator.reverseOrder());
	}
	
}


