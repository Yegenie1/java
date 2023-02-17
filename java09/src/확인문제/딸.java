package 확인문제;

public class 딸 {
	
	String name;
	char gender;
	static int coin=10000;
	static int count;
	
	
	public 딸(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
		coin-=1000;
		count++;
	}

	public void tv보다() {
		System.out.println("누워서 tv보는 중");
	}
//	2) static 확인문제
//딸.java ==> 멤버변수(이름, 성별), static변수(아빠지갑), 멤버멤서드(tv보다())
//- 딸이 태어날때마다 아빠지갑에서 1000원씩 꺼내서 줌.
//- 딸이 태어날때마다 카운트
//우리집.java ==>
//	딸 d1 = new 딸("홍길순", "여");
//	딸 d2 = new 딸("홍길진", "여");
//           a. 딸들의 정보 출력
//           b.딸이 몇명인지 카운트한 것 프린트
//           c. 현재 남은 아빠 지갑에 들어있는 돈 프린트

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

}
