package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		// 정수형 변수 4가지
		// -128~127, 1바이트 byte
		// -3만~3만, 2바이트 short
		// -21억~21억, 4바이트 int
		// 21억 이상, 8바이트 long

		byte age = 127;
		short days = 1000;
		int money = 100000;
		// long bank = 2300000000;//왜 에러? - jdk가 long으로 인식x int로 인식
		long bank = 2300000000L;// 대문자나 소문자 l or L쓰기

		// 실수형 변수2가지
		// 소수점 4자리까지 4바이트 float
		// 소수점 4자리 이상 8바이트 double

		float height = 170.4F;// f or F 쓰기
		double weight = 43.333333;

		// 문자1 char
		// 논리형 boolean

	}

}
