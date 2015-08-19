package java_OOP;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		//goods.name = "nickon";
		goods.setName("Nikon");
		goods.setPrice(200000);
		goods.setCountSold(10);
		goods.setCountStock(20);
		
		System.out.println("상품이름 : "+goods.getName());
		System.out.println("상품가격 : "+goods.getPrice());
		System.out.println("재고수 : "+goods.getCountStock());
		System.out.println("판매량 : "+goods.getCountSold());
		
	}

}
