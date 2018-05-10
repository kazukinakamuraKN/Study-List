package study;

class Circle2{
	final double enshuritu = 3.14;
	final double keisan(double hankei){
		return hankei * hankei * enshuritu;
	}
}
public class StudyFinal2 {
	public static void main(String []args){
		Circle2 circle2 = new Circle2();
		double area2 = circle2.keisan(2.0);
		System.out.println("menseki = " + area2);
	}
}
