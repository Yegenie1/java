package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		// 인기투표
		// 1)아이유 2)방탄 3)뉴진스4)종료
		Scanner sc = new Scanner(System.in);

		int a = 0;// 아이유
		int b = 0;// 방탄
		int c = 0;// 뉴진스
		// 누적시키는 변수는 반복문안에 넣지 않는다
		System.out.println("인기투표 시스템");
		System.out.println("==========");

		for (int i = 0; i < 10; i++) {
			System.out.print("1)아이유 2)방탄 3)뉴진스4)종료 >>");
			String data = sc.next();
			if (data.equals("1")) {
				a++;
			} else if (data.equals("2")) {
				b++;
			} else if (data.equals("3")) {
				c++;
			} else if (data.equals("4")) {
				System.out.println("시스템을 종료합니다");
				break;
			}
		}
		System.out.println("-----------");

		System.out.println("아이유 " + a + "표");
		System.out.println("방탄 " + b + "표");
		System.out.println("뉴진스 " + c + "표");

		sc.close();

	}

}
