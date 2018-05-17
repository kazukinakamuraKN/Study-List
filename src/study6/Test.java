package study6;

public class Test {
	public static void main(String[] args){
		hello(10,"a");
		hello();
	}

	public static void hello(Integer a,String b){
		System.out.println("hello" + a + "" + b);
	}

	public static void hello(){
		System.out.println("hello");
	}
}
