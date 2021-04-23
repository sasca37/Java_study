package abstract_;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GasolinCar {
	private String color;
	private String manufacturer;
	
	public void printInfo() {
		System.out.println("색 :" + this.color);
		System.out.println("차 :" + fillUp());
		System.out.println("생산지 : " + this.manufacturer);
	}
	
	public String fillUp() {
		return "휘발유";
	}
}
