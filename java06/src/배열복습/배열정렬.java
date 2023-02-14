package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬 {

	public static void main(String[] args) {
		// 정렬 할 때는 Arrays

		int[] a = new int[10000];
		Random r = new Random(42);// seed

		int suma = 0;
		double avera = 0;
		int sumf = 0 ;
		double averf=0;

		// for : 입력, 출력, i활용 가능
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(1000) + 1;// 1~1000
		}

		// for each : 알아서 위치값을 옮겨주면서 하나씩 꺼내옴
		for (int x : a) {
			System.out.println(x);
		}

		// 오름차순 정렬(작-->큰) 내림차순 정렬(큰-->작)
		Arrays.sort(a);
		// sort(a) ==> a가 바뀌어버림(원본이 파괴)
		// ==>파괴형함수
		// ex) parseInt(n) ==> ram에 저장된 n이 변경된 건 아님 (원본이 비파괴)
		// ==>비파괴형 함수

		System.out.println("-----------------");
		// 정렬 후
		for (int x : a) {
			System.out.println(x);
		}

		// 정렬후, 최대값 최소값 프린트
		System.out.println("최소값 : " + a[0]);
		System.out.println("최대값 : " + a[a.length - 1]);

		// 상위30%, 인원 3000명, 높은점수부터 3000개 추출
		for (int i = 7000; i < a.length; i++) {//상위30%

			suma += a[i];

		}
		avera = suma / 3000.0;
		System.out.println("상위 30% 학생들의 평균은 " + avera);
		
		for (int i = 0; i < 3000; i++) {//하위30%
			sumf += a[i];
		}
		
		averf = sumf / 3000.0;

		System.out.println("하위 30% 학생들의 평균은 " + averf);
		String result = Arrays.toString(a);
		System.out.println(result);
		
	}

}
