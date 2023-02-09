package 배열;

public class 배열값다루기 {
	public static void main(String[] args) {
		int[] x = new int[10];// length :10 총저장공간 12개 x포함

		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 1 작음.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;

		for (int i = 0; i < x.length; i++) {// 배열을 자동으로 찾아줌 자동완성
			System.out.print(x[i] + " ");
		}

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[3]);

		// 가족의 성별을 char로 저장하고 프린트

		char[] gender = { '남', '여', '남', '여', '여' };

		System.out.println();
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		// 가족 이름

		String[] name = { "홍길동", "김엄마", "홍일", "홍이", "홍삼" };
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}

		// 가족 시력

		double[] eyes = { 1.0, 1.5, 0.4, 0.5, 0.9 };
		System.out.println();
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i] + " ");

		}

		// 점심여부

		boolean[] lunch = { true, false, true, true, false };
		System.out.println();
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}

	}

}
