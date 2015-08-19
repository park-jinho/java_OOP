package com.bit2015.paint.point;

import com.bit2015.paint.i.Drawable;

public class Point implements Drawable{
	//정보은닉/캡슐화 private
	private int x;
	private int y;
	
	//생성자 오버로드
	public Point(){
		System.out.println("Point 생성자 호출");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 생성자 호출");
	}
	
	//private 필드에 접근 할 get/set
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("[ x = "+x+", y = "+y+" ]에 점을 그렸습니다.");
	}
}
