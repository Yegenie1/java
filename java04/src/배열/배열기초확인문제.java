package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// 1.int 크기5
		int[] a = new int[5];
		// 2. 배열크기
		System.out.println(a.length);
		// 3.첫번째 위치 100 프린트
		a[0] = 100;
		System.out.println(a[0]);
		// 4.마지막 위치 500 프린트
		a[4] = 500;
		System.out.println(a[4]);
		// 5.세번째 위치 200 프린트
		a[2] = 200;
		System.out.println(a[2]);
		//6. 배열전체 프린트
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		//7.배열전체와 인덱스 함께 프린트
		for (int i = 0; i < a.length; i++) {
			System.out.println(i +": " + a[i] );
		}

	}

}
