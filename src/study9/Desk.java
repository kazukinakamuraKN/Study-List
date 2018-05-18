package study9;

public class Desk {
	//フィールド
	String name;
	Integer wide;
	Integer height;
	Integer high;
	Integer rack; //引き出しの数
	Integer foot = 4;
	//コンストラクタ
	Desk(String name, Integer wide , Integer height, Integer high, Integer rack){
		this.name = name;
		this.wide = wide;
		this.height = height;
		this.high = high;
		this.rack = rack;
	}
	Desk(){

	}
	//メソッド
}
