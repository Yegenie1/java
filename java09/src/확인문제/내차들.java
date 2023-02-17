package 확인문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeeTruck ct = new CoffeeTruck();
		ct.coffee = true;
		ct.color = "white";
		ct.짐 = false;
		ct.size = 500;
		ct.시속 = 100;
		System.out.println("커피가 있나요? " + ct.coffee);
		System.out.println("커피차의 색깔은" + ct.color);
		System.out.println("짐이 있나요?" + ct.짐);
		System.out.println("커피차의 크기는" + ct.size);
		System.out.println("커피차의 시속은" + ct.시속);
		ct.소음있다();
		ct.이용하는사람들();
		ct.주행하다();
		ct.타다();
	}

}
