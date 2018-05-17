package study8;

public class GoCar {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//int carOld, String name, int carOil, String carEconomyRank
		Car wagonr = new Car(15, "わごんR", 30, "普通");
		wagonr.carIntroduce();
		wagonr.drive(10);
		Car randcruise = new Car(20, "ランクル", 100, "普通");
		randcruise.drive(50);
		randcruise.carIntroduce();
		wagonr.oilCharge(100);
		Car pixis = new Car(10, "ピクシス", 40," 軽自動");
		pixis.drive(20);
		pixis.carIntroduce();
		randcruise.oilCharge(500);
		pixis.oilCharge(50);
		Car noname = new Car(10);
		noname.oilCharge(30);
		noname.drive(10);
		noname.carIntroduce();
	}

}
