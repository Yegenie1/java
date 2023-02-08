package 조건문;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {

		// Scanner
		Scanner sc = new Scanner(System.in); // 컴퓨터에서.키보드로 입력하겠다

		System.out.print("아이디 입력>>");
		String id = sc.next();

		System.out.print("비밀번호 입력>>");
		String pw = sc.next();

		String id1 = "root";
		String pw1 = "1234";

		if (id.equals(id1) && pw.equals(pw1)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		System.out.print("사과 구매개수 입력>> ");
		int numA = sc.nextInt();
		System.out.print("사과 한 개당 가격 입력>> ");
		int priceA = sc.nextInt();

		System.out.print("딸기 구매개수 입력>> ");		
		int numS = sc.nextInt();
		System.out.print("딸기 한 개당 가격 입력>> ");
		int priceS = sc.nextInt();

		System.out.println("사과 구매가격은 " + (numA * priceA) + "원 입니다.");
		System.out.println("딸기 구매가격은 " + (numS * priceS) + "원 입니다.");
		System.out.println("전체 구매가격은 " + ((numA * priceA) + (numS * priceS)) + "원 입니다.");
		sc.close();

	}

}
