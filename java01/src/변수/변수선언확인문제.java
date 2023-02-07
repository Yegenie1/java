package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 23;//정수 (integer)
		double height = 165.5;//실수
		char first = '최';//문자1
		boolean marry = false;//논리(boolean)
		
		//기본데이터x ==> 너무 많이 쓰기 때문에 기본형처럼 기본형데이터처럼 사용 가능!
		String name = "홍길동";//여러글자를 쓸때는 ""
		//스트링 , 실 ,문자열 !! 대문자로 시작
				
		

		System.out.println("내 나이는 " + age);
		System.out.println("내 키는 " + height);
		System.out.println("내 성는 " + first);
		System.out.println("결혼 여부는 " + marry);
		System.out.println("내 이름은 " + name);

	}

}
