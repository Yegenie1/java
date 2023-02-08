package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in); // 컴퓨터에서.키보드로 입력하겠다

		System.out.print("나이 입력>>");
		int age = sc.nextInt();
		System.out.println("내년나이는 " + (age +1)+ "세");
		
		System.out.print("키를 입력>>");
		double h = sc.nextDouble();
		System.out.println("당신의 키는 " + h + "cm");
		
		System.out.print("저녁을 먹었는지 입력(true/false)>>");
		boolean dinner  = sc.nextBoolean();
		System.out.println("나는 저녁을  " + dinner + "했습니다.");
		if (dinner) {
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배가 고프시겠군요");
		}
		
		System.out.print("올해의 목표는>>");
		sc.nextLine();//한줄쓰기 enter받음
		String life = sc.nextLine();
		System.out.println("올해의 목표는 " + life + "입니다.");
		sc.close();

	}

}
