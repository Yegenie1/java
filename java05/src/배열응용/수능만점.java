package 배열응용;

import java.util.Random;

public class 수능만점 {

	public static void main(String[] args) {
		int[] a = new int[10000];
		Random r = new Random(42);

		int count = 0;
		int count0 = 0;
		int sum = 0;
		double aver = 0;
		int cnt = 0;
		double aplus = 0 ;
		int cnta=0;
		int suma=0;
		double avera=0;

		
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(451);
			sum += a[i];

			if (a[i] == 450) {
				count++;
				System.out.println("수능만점자 학생 index는 " + i);
			} else if (a[i] == 0) {
				count0++;
			}

		}

		aver = (double)sum / a.length;
		
		for (int i = 0; i < a.length; i++) {
			
			if ((aver + 50 >= a[i]) && (aver - 50 <= a[i])) {
				cnt++;
			}
			
			aplus = 0.7009 * 450;//3000등 구하기
			//aplus = 0.7 * 450;//점수 상위 30% 구하기
			
			if (aplus <= a[i]) {
				cnta++;
				suma += a[i];
			}
		}
		avera = suma/cnta;

		System.out.println("수능 만점자 수는 " + count);
		System.out.println("수능 0점자 수는 " + count0);

		System.out.println("학생들의 평균은 " + aver);
		System.out.println("평균보다 +-50인 학생 수는 " + cnt);
		
		//System.out.println("3000등의 점수는 " + aplus);
		System.out.println("30%범위에 있는 학생들의 평균은 " + avera);
		System.out.println("30%범위에 있는 학생 수는 " + cnta);
	}

}
