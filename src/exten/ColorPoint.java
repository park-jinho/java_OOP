package exten;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		//this.x = x; private 접근불가 protected면 가능
		//라이브러리사용 상속받아사용시 private
		//get/set어디서나 사용!! 생성자호출안하면 기본생성자호출
		/*setX(x);
		setY(y);*/
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint 생성자 호출");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Point에서 구현한 draw() 재정의.
	@Override
	public void draw() {
		/*super.show(); //부모꺼추가시넣는다.
		System.out.println("color = "+color);*/
		System.out.println("[ x = "+getX()+", y = "+getY()+", color = "+color+" ]에 점을 그렸습니다.");
	}
	
}
