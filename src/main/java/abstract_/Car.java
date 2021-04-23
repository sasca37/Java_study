package abstract_;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
	protected String color;
	protected String manufacturer;
	
	public abstract String fillUp();
	
	public void printInfo() {
		System.out.println("색 :" + this.color);
		System.out.println("차 :" + fillUp());
		System.out.println("생산지 : " + this.manufacturer);
	}
	
	public String getColor() {
		return color;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
}
