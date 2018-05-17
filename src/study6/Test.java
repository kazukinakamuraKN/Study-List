package study6;

public class Test {
	public static void main(String[] args){
		hello(10,"a");
		hello();
		System.out.println(testString());
	}

	public static void hello(Integer a,String b){
		System.out.println("hello" + a + "" + b);
	}

	public static void hello(){
		System.out.println("...");
	}

	public static int testInt(){
		return 10;
	}

	public static String testString(){
		return "aiuel";
	}

	public static boolean testIntReturn(int a){
		boolean result;
		result = (a % 3 == 0);
		return result;
	}
}
