package com.multi.www.web05;

public class Coffee2 {
	
	int price=5000;
	String name="핸드드립";
	
	public static Coffee2 Coffee;//null
	
	public static Coffee2 getinstance() {
		if(Coffee == null) {
			Coffee = new Coffee2();
		}
		return Coffee;

	}
	
	//private이 아니라 public으로 생성자를 만들어준다면 다른곳에서 
	//Coffee2 c3 = new Coffee2();와 같이
	//마음대로 객체를 생성할 수 있게 되어서 싱글톤이 불가능함

	private Coffee2() {
	}



//	@Override
//	public String toString() {
//		return "Coffee1 [price=" + price + ", name=" + name + "]";
//	}

}
