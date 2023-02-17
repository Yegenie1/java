package 확인문제;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", '여');
		딸 d2 = new 딸("홍길순", '여');
//	           a. 딸들의 정보 출력
//	           b.딸이 몇명인지 카운트한 것 프린트
//	           c. 현재 남은 아빠 지갑에 들어있는 돈 프린트
		d1.tv보다();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("딸은 모두 " +딸.count + "명입니다");
		System.out.println("아빠 지갑에 남은 돈은 "+딸.coin+"원");
		
		
		
	}

}
