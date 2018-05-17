package study5;

public class Array {
	public static void main (String[] args){
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = new int[10];
		for(int c = 0; c < a.length; c++){
			System.out.println(c * a.length);
		}
	}
}
