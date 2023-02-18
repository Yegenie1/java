package 복습;

public class Mask {
	String color;
	int price;
	int count;
	
	
	//클래스 이름과 동일한 메서드를 만들어주면 new를 가지고 객체생성시 자동호출
	//생성자(메서드)==>constructor
	public Mask(String color, int price, int count) {

		this.color = color;
		this.price = price;
		this.count = count;
	}


	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
	
	
	
	
	
	
}
