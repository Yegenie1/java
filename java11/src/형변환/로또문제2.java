package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());//처음엔 0이라서 for문안에 lotto.size넣으면 안됨
		for (int i = 0; i < 10; i++) {
			lotto.add(r.nextInt(10));
		}
		System.out.println(lotto.size());//10보다 작은 이유 ==> 중복이 있었다!!
		System.out.println(lotto);
		
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000));
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
		

	}

}
