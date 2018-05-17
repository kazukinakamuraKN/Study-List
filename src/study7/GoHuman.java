package study7;

public class GoHuman {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human taro = new Human("taro",19910226,300,"朝");
		//仮引数をセットしても、コンストラクタで設定しなければ値はせっとされていない

		taro.eating();
		System.out.println(taro.timeZone);
		taro.sleepinp();
		System.out.println(taro.remainingPhysicalStrength);

		//インスタンス化した時点で、Humanオブジェクトはできる
		//しかし、パラメーターはせっていされていない。
		//int a;の状態？
		Human hanako = new Human();
		System.out.println(hanako.name);
		hanako.eating();
		hanako.sleepinp();
		System.out.println(hanako.remainingPhysicalStrength);
	}

}
