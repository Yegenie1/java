package 반복문;

public class 반복문안에서스킵 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트
		// !==>not!!

		for (int i = 1; i <= 10; i++) {
			if (i == 8) {
				//break;// i가 8이 되면 for문 종료
				System.exit(0); //클래스를 완전히 끝내고 싶을때
				//0 : 정상 종료 //0이 아닌 다른값 : 비정상종료 상제종료
			}
			if (i % 2 != 0) {// 홀수
				continue;// 이번 i만 for문 안의 내용을 실행하지마!!
			}
			System.out.println(i);

		}
		System.out.println("for문 끝!");

	}

}
