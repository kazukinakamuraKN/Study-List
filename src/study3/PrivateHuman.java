package study3;

public class PrivateHuman {
	//フィールド
	private String name;
	private Integer age;
	private Integer vitality;
	private final int life = 1;

	//引数ありコンストラクタ
	PrivateHuman(String name, Integer age, Integer vitality){
		this.name = name;
		this.age = age;
		this.vitality = vitality;
	}

	PrivateHuman(String name, Integer age){
		this(name,age,200);
	}

	PrivateHuman(String name){
		this(name,20);
	}
	//コンストラクタ
	PrivateHuman(){
		this("不明");
	}
	//メソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getVitality() {
		return vitality;
	}
	public void setVitality(Integer vitality) {
		this.vitality = vitality;
	}
	public int getLife() {
		return life;
	}

	public void introduce(){
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
		System.out.println("体力は" + vitality + "です");
		System.out.println("命は" + life + "です");
	}
}
