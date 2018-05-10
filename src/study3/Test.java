package study3;

public class Test {

	public static void main(String[] args) {
		humanSatou();
		humanSimizu();
		humanGotou();
	}

	public static void carDescription(){
		//Carクラスの変数noteに対して、newでインスタンスを作成して代入
		Car note = new Car();
		note.name = "note";
		note.economy = 20;
		note.price = 200;
		note.rank = "hyblid";
		note.description();
	}

	public static void humanSatou(){
		Human satou = new Human();
		satou.vitality = 200;
		satou.age = 10;
		satou.name = "砂糖";
		satou.talk();
		satou.vitalityLimit();
		//引数ありコンストラクタがあるとフィールド名を何回も書かなくて済む
	}

	public static void humanSimizu(){
		Human simizu = new Human("清水",25,170);
		simizu.talk();
		simizu.vitalityLimit();
		//カプセルかしてないから変更できる
//		simizu.age = 100;
	}

	public static void humanGotou(){
		PrivateHuman gotou = new PrivateHuman("後藤",14,180);
		gotou.introduce();
		System.out.println(gotou.getName());
		gotou.setName("佐川");
		String ename = gotou.getName();
		System.out.println(ename + gotou.getName());
		gotou.introduce();
		//カプセル化してるからへんこうできない
//		gotou.age = 100;
	}
}
