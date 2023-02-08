package 조건문;

import java.util.Scanner;

public class 콘솔입력 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in); // 컴퓨터에서.키보드로 입력하겠다
		// 자바프로그램과 콘솔간의 통로를 만든다.
		// 연결통로 == 강물(스트림, stream)
		// stream은 내가 닫아주지 않으면 계속 가지고 있게 됨. sc.close();
		// stream을 반드시 닫아주자!!

		System.out.print("요일 입력 : 주중 1) 주말2)");
		int data = sc.nextInt();// string을 int로 바꾸어줌
		if (data == 1) {
			System.out.println("열심히 달리자아아");
		} else {
			System.out.println("푹 쉬자!!");
		}
		
		System.out.print("주말에 뭐할까?");
		String data2 = sc.next();
		System.out.println("나는 주말에 " + data2 + "를 할거야");
		sc.close();

	}

}
