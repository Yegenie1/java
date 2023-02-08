package 조건문;

import java.util.Scanner;

public class 심화문제 {

	public static void main(String[] args) {
//		3. 심화문제
//		   - 시작값, 종료값 입력
//		   시작값부터 종료값까지 모두 더해서 출력
		Scanner sc = new Scanner(System.in); // 컴퓨터에서.키보드로 입력하겠다

		System.out.print("시작값 입력>>");
		int start = sc.nextInt();
		System.out.print("종료값 입력>>");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

//		4. 심화문제
//		   - 시작값, 종료값, 점프값 입력
//		     시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
//		     더한 값이 100을 넘으면 프로그램 종료

		System.out.print("시작값 입력>>");
		int start2 = sc.nextInt();
		System.out.print("종료값 입력>>");
		int end2 = sc.nextInt();
		System.out.print("점프값 입력>>");
		int jump = sc.nextInt();

		int sum2 = 0;
		for (int i = start2; i <= end2; i += jump) {
			if (sum2 >= 100) {
				break;
			} else {
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum2);

		sc.close();

	}

}
