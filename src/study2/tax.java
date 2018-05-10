package study2;

public class tax {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int motone = 10;
		int kotae = zeikomi(motone);
		System.out.println(kotae + motone);
	}

	public static int zeikomi(int nedan){
		int zeikomi;
		zeikomi = (int)(nedan * 0.08);
		System.out.print(zeikomi);
		return zeikomi;
	}
}
