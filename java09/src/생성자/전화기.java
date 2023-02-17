package 생성자;

public class 전화기 {

	// 성질:멤버변수(가격, 모양)
	//public은 아무데서나 (다른패키지에서도) 접근가능 설정(접근제어자)
	public int price; //멤버변수는 자동초기화! (0이 들어가있음)
	public String shape; //기본형이 아닌 경우 모두 null로 초기화
	
	//눈에 보이지는 않지만 기본 생성자가 만들어져 있음. 
	//묵시적으로 기본생성자가 만들어져 있음
	
	public 전화기() {
		System.out.println("전화기 객체가 만들어졌음");
	}

	
	// 동작:멤버메서드(함수와 동일), 동적인 기능을 수행
	//		인터넷하다, 카톡하다
	public void 인터넷하다() {
		//기능 처리하는 방법 나열
		System.out.println("와이파이 연결");
		System.out.println("데이터를 써서 연결");
	}
	
	
	public void 카톡하다() {
		System.out.println("자바 단체톡");
		System.out.println("게시물");
	}

}
