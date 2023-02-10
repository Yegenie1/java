package 배열기본;

import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int[] jumsu = new int[999];

		for (int i : jumsu) {
			System.out.println(i);
		}

		System.out.println("==============");

		Random r = new Random();
//		int data = r.nextInt(4) + 1;//+1 안하면 0~3까지만 나옴==>1~4
//		System.out.println(data);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(4) + 1;
		}
		
		for (int x : jumsu) {
			System.out.println(jumsu[x]);			
		}

	}

}
