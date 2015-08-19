package com.bit2015.paint.main;

import com.bit2015.paint.i.Drawable;
import com.bit2015.paint.point.ColorPoint;
import com.bit2015.paint.point.Point;
import com.bit2015.paint.shape.Circle;
import com.bit2015.paint.shape.Triangle;

public class MainAPP {

	public static void main(String[] args) {
		//static함수는 static메소드만 호출가능. 메소드에static붙인다.
		//static 아닐시 MainAPP.testColorPoint();
		/*testPoint();
		testColorPoint();*/
		testPaintShape();
	}
		
	//도형으만드는프로그램 그릴때마다 여러개를 오버로드해야한다.
	//추상클래스 존재시 Shape로 하나로 통일 가능.
	private static void paint(Drawable d) {
		d.draw();
		//Shape를 상속받는 모든 클래스가 인자로 올수잇다.
		//오버로딩이 사라진다.
		/*private static void paint(Trinagle triangle) {
		triangle.draw();
	}
	
	private static void paint(Circle circle) {
		circle.draw();
	}*/
	}
	
	private static void testPaintShape() {
		//Shape s = new Triangle();
		
		paint(new Triangle());
		paint(new Circle());
		paint(new ColorPoint(5, 5, "red"));
		paint(new Point(2, 3));
		/*private static void testTriangle() {
		Shape s = new Triangle();
		s.draw();
	}*/
	}
	
	private static void testPoint() {
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(20);
		
		point1.draw();
		
		Point point2 = new Point(100, 200);
		point2.draw();
	}
	
	private static void testColorPoint() {
		//부모타입으로 담을 수 있다. 부모객체만 사용가능.
		Point point3 = new ColorPoint(50, 50, "red");
		point3.draw();
	}
	
}
