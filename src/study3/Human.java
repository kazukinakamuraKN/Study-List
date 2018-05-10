package study3;

public class Human {
	//フィールド→コンストラクタ→メソッドの順で書く
//フィールドの定義
	String name;
	Integer age;
	//Company company;
	Integer vitality;

	//コンストラクタの定義
	//デフォルトコンストラクタ
	Human(){

	}
	//引数ありコンストラクタ
	Human(String name, Integer age, Integer vitality){
		this.name = name;
		this.age = age;
		this.vitality = vitality;
	}

	Human(String name, Integer age){

	}

	Human(String name){

	}

	//メソッドの定義
	void introduce(){//自己紹介をするメソッド
		vitality -= 10;
		System.out.println("名前は" + name + "です");
	}

	void talk(){//年齢を言うメソッド
		vitality -= 10;
		System.out.println("年は" + age + "です");
	}

	void vitalityLimit(){
		System.out.println("残り体力は" + vitality + "です");
	}
}