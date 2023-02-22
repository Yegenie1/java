package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);// Object <- 업캐스팅- Integer <-오토박싱- int
		me.add(189.1);// Object <- Double <- double
		me.add(false);// Object <- Boolean <- boolean
		me.add('남');// Object <- Character <- char

		// ArrayList는 toString()가 재정의
		// list라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
		// toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
		// list를 찍어보면 주소대신 String으로 만든 내용이 출력

		System.out.println(me);

		int money = (Integer) me.get(0);//int <-오토언박싱- Integer <-다운캐스팅- Object
		double h = (Double) me.get(1);// double <-Double <- Object
		boolean meal = (Boolean) me.get(2);// boolean <-Boolean <- Object
		char gender = (Character) me.get(3);// char <-Character <- Object

		System.out.println(money + 2000);
		System.out.println(h + 10);

		if (meal) {// boolean 조건 true
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}

		if (gender == '남') {
			System.out.println("주민번호는 1, 3이예요");
		} else {
			System.out.println("주민번호는 2, 4이예요");

		}

	}

}
