package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		
		// 조건을 쓸 때는 비교하는 것으로 쓰고, 결과는 무조건 true,false
		//비교연산자 ( ==,!=, >, >=)로 비교할 수 있는 것은 기본형 데이터만 가능

		if (x == 0) {
			System.out.println("내가 실행되겠지");
		}else {//false일때 처리하고 싶은 내용
			System.out.println("나는 거짓일때 실행 돼 ");
		}

		if (x == 1) {
			System.out.println("나는 실행 안되겠지");
		}
	}

}
