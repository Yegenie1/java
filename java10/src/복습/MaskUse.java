package 복습;

public class MaskUse {

	public static void main(String[] args) {
		Mask m1 = new Mask("하얀색",1000,3);//객체생성
		//멤버변수값을 매번 준다
		//객체생성시 멤버변수값을 자동으로 무조건 넣어주는 처리를 하고싶다.
//		m1.color = "하얀색";
//		m1.price = 1000;
//		m1.count = 3;

//		System.out.println(m1.color);
//		System.out.println(m1.price);
//		System.out.println(m1.count);
		
		System.out.println(m1);
		
	}

}
