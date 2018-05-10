package study3;

public class Car {
	//フィールド
	String name;//car name
	String rank;//hyblid or normal
	Integer economy;//燃費
	Integer price;//値段

	//メソッド
	void description(){
		System.out.println("この車は" + name + "といいます");
		System.out.println("仕様は" + rank + "車です");
		System.out.println("燃費は"+ economy + "km/Lです");
		System.out.println("価格は" + price + "円です");
	}

}