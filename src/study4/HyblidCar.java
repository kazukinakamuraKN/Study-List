package study4;

public class HyblidCar extends Car{
	public static void main(String[]args){
		Car estima = new HyblidCar();
		estima.economy = 1;
		estima.name = "fire---";
		estima.introduce();
		String name = "a";
		estima.introduce(name);

	}
}
