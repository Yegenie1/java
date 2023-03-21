package com.multi.www.web05;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 c1 = Coffee2.getinstance();
		System.out.println(c1);
		//앞에서 만들어져서 nullx 이미 만들어진 주소값을 줌 싱글톤
		Coffee2 c2 = Coffee2.getinstance();
		System.out.println(c2);
	}

}
