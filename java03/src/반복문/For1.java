package 반복문;

public class For1 {

	public static void main(String[] args) {
		
		//for(초기값;조건식;증감식){}
		// 3번반복
		for (int i = 0; i < 3; i++) {
			//for지역{}안에서만 i변수를 쓸 수 있음
			//지역변수(local) i
			System.out.println(i + "내가 반복1");
		}

		// 100번 반복
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복2 >> " + i);

		}

		// 10번 반복
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복3 >> " + (i + 1) + "번째 실행중");
		}

	}

}
