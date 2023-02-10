package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];

		Random r = new Random(42);// 시드값

		// 2~20 배열에 넣고 프린트

		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
		}
		for (int x : jumsu2) {
			System.out.println(x);
		}

		System.out.println("================");

		// 15이상 숫자가 몇개인지 프린트
		int count = 0;
		int sum = 0;
		for (int j = 0; j < jumsu2.length; j++) {

			if (jumsu2[j] >= 15) {
				count++;
				sum += jumsu2[j];
			}
		}
		System.out.println("15이상인 숫자는 " + count);
		System.out.println("15이상인 숫자들의 합은 " + sum);
		

	}

}
