package abstract_;

public class Pet_Main {

	public static void main(String[] args) {
		Pet cat = new Cat(false, 4);
		cat.run(getPetName(cat));
		
		Pet parrot = new Parrot(true, 2);
		parrot.run(getPetName(parrot));
		
		Parrot pr = (Parrot) parrot; //다운캐스팅 
		pr.fly(getPetName(parrot));
	}


public static String getPetName(Pet pet) {
	String str = "";
	if(pet instanceof Cat) {
		str="고양이";
	}
	else {
		str = "앵무새";
	}
	return str;
}
}