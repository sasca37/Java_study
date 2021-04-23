package abstract_;

public class ElectricCar extends Car {

	@Override
	public String fillUp() {
		return "전기 충전";
	}

	public ElectricCar(String color, String manufacturer) {
		super(color, manufacturer);

	}
	
	
		
}
