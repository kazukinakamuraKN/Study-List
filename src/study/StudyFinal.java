package study;

class Circle{
	final double PI = 3.14159;

	final double calculateAreaOfCircle(double radius){
		return PI * radius * radius;
	}
}
public class StudyFinal {
	public static void main(String[]args){
		Circle circle = new Circle();
		double area = circle.calculateAreaOfCircle(2.0);
		System.out.println("area = " + area);
	}
}
