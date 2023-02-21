package 상속;

import java.io.IOException;

public class 예외처리3 {

	public static void main(String[] args) {
		
		//아래의 코드에서 문제가 생길 여지가 있는 코드를 보고 에러가 발생했을 때 실행을 제외시켜버리고 프로그램이 중단되지 않도록
		int[]num = new int[3];
		try {
			num[3]=2;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("배열에 문제발생");
		}
		
		System.out.println("배열의 개수는 "+num.length+"개 입니다!!");//배열의 개수
	}

}
