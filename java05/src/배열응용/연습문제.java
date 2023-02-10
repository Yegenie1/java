package 배열응용;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		// 1

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수입력");
			arr[i] = sc.nextInt();
		}
		System.out.println("첫번째와 세번째를 더한 값은 " + (arr[0] + arr[2]));

		String[] st = new String[3];
		for (int i = 0; i < st.length; i++) {
			System.out.print("문자열 입력");
			st[i] = sc.next();
		}
		System.out.println(st[0] + " 보다는 " + st[1]);
		sc.close();
	}

}
