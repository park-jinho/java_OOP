package com.bit2015.paint.shape;
//abstract메소드가 존재하면 abstract클래스가된다.
public abstract class Shape {
	private String fillColor;
	private String lineColor;
	
	//추상클래스를 만든다.
	//추상클래스를 자식 클래스에서 오버라이드 해서사용.
	//클래스도 추상클래스로만든다. 객체화 불가능하게 한다.
/*	public abstract void draw(); { 인터페이스  변경
		System.out.println("구체적인 구형을 그릴수 없다.");
	}*/
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
}
