package study5;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習１helloworld 出力
		System.out.println("Hello World");
		//練習2int型に入力
		int x;
		x = 11;
		int y = 12;
		System.out.println("x=" + x + " y=" + y);
		//3.a,bにそれぞれ代入し計算
		int a = 10;
		int b = 38;
		System.out.println("a + b = " + (a + b));
		//4.cに13と17の和を代入しxを出力
		int c;
		c = 13 +17;
		System.out.println("cの値は" + c);
		//5.変数無しで13と17の和を出力
		//左から順に足し算され、String13 + 17 .String1317となる
		System.out.println("13 + 17 = " + 13 + 17);
		System.out.println(13 + 17 + "　は13と17の和");
		/*6int 型の変数 x に数値 7 を代入する。
		変数 x の値を 3 倍にする。
		変数 x の値を表示する。
		変数 x の値を半分（1/2）にする。
		変数 x の値を表示する。*/
		int d = 7;
		d *= 3;
		System.out.println(d);
		d /= 2;
		System.out.println(d);
		/*7.int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。

※ 	xとy以外に、もうひとつ変数が必要となる。*/
		int e = 100;
		int f = 10;
		int g = e;
		e = f;
		f = g;
		System.out.println("e=" + e + ",f=" + f);
		/*8.int 型の変数 x、y に数値 19、23 を代入し、その積を変数 z に代入して z の値を表示するプログラムを作成しなさい。*/
		int h = 19;
		int i = 23;
		int j = h * i;
		System.out.println("j = " + j);
		/*9.int 型の変数 x に任意の数値を代入し、x を 2 倍、3 倍、4 倍した結果を表示するプログラムを作成しなさい。*/
		int k = 100;
		for(int l = 2; l < 5; l++){
			System.out.println("k = " + (k * l));
		}
		/*練習問題 1 - 10
int 型の変数 x に任意の数値を代入し、x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。*/
		int m = 100;
		System.out.println(m);
		System.out.println(m * m);
		System.out.println(m * m * m);
		/*練習問題 1 - 11
int 型の変数 x に任意の数値を代入し、x を x より小さい任意の数値で割った商と余りを表示するプログラムを作成しなさい。*/
		int n = 30;
		System.out.println(n / 3);
		System.out.println(n % 3);
		/*練習問題 1 - 12
int 型の変数 x に任意の数値を代入し、インクリメント演算子、デクリメント演算子を適用して結果を表示することにより演算子の効果を確認するプログラムを作成しなさい。*/
		int o = 40;
		System.out.println(o++);
		System.out.println(++o);
		System.out.println(o--);
		System.out.println(--o);
	}

}
