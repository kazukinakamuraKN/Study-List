package study8;

public class Car {
	//メンバー変数
	static int tire = 4;//タイヤの数
	static int countCar = 0;//車の総台数
	int carOld;//何年前に作られたか
	String name;//この車の名前
	int carOil;//残りのガソリン
	String carEconomyRank;//普通車かハイブリット車か
	//コンストラクタ
	Car(int carOld, String name, int carOil, String carEconomyRank){
		countCar++;
		this.carOld = carOld;
		this.name = name;
		this.carOil = carOil;
		this.carEconomyRank = carEconomyRank;
	}

	Car(int carOld, String name, int carOil){
		this(carOld, name, carOil, "普通車");
		//全てのコンストラクタに必要そうだがいらない↓
		//countCar++;
	}

	Car(int carOld, String name){
		this(carOld, name, 50);
	}

	Car(int carOld){
		this(carOld, "車名不明");
	}

	Car(){
		this(10);
	}
	//メソッド
	//走る
	void drive(int useOil){
		System.out.println(name + "走りました");
		carOil -= useOil;
	}
	//給油
	void oilCharge(int chargeOil){
		System.out.println(chargeOil + "L給油しました");
		carOil += chargeOil;
	}
	//紹介
	void carIntroduce(){
		System.out.println("車名は" + name + "です");
		System.out.println("タイヤは" + tire + "個です");
		System.out.println("車は今までに" + countCar + "台作られました");
		System.out.println("この車は" + carOld + "年前に作られました");
		System.out.println("残りのガソリンは" + carOil + "Lです");
		System.out.println("この車は" + carEconomyRank + "車です");
	}
}
