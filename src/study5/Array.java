package study5;

public class Array {
	public static void main (String[] args){
		/*練習問題 5 - 1
次のプログラムを作成しなさい。

10 個の数値を入力する。
入力された各々の数値を 2 倍にして表示する。*/
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		//int b[] = new int[10];
		for(int c = 0; c < a.length; c++){
			System.out.println(a[c] * 2);
		}
		/*練習問題 5 - 2
次のプログラムを作成しなさい。

10 個の数値を入力する。
入力された順番と逆の順番で 10 個の数値を表示する。*/
		int d[] = {1,2,3,4,5,6,7,8,9,10};
		for(int e = d.length -1; e >= 0; e--){
			System.out.println(d[e]);
		}
		/*練習問題 5 - 3
次のプログラムを作成しなさい。

10 個の数値を入力する。
入力された数値を偶数と奇数に分類して表示する。*/
		//%を使ってあまりがでたものは奇数出ないものは偶数
	}
}
