package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서 저장공간에 넣고 싶을 때 ==> 배열사용!!
		//1. 배열만들기
		int[] jumsu = new int [5];
		
		//각 배열에 값을 넣을 때는 index가 필요=>i가 있는 for문 사용
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			
			//숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자
			jumsu[i] = Integer.parseInt(data);
		}
		
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//1. 전체 합계구해서 평균
		int sum=0;
		double aver = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		aver = (double)sum/jumsu.length;
		System.out.println("전체 평균은 " + aver);
		
		
		//2. 300이상되는 숫자만 찾아서 합계
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if(jumsu[i]>=300) {
				sum2 +=jumsu[i];
			}
		}
		System.out.println("300이상 되는 숫자의 합은 " + sum2);
		
		//3. 심화 300이상되는 인덱스를 프린트
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>=300) {
				System.out.println("300이상 되는 숫자의 위치는 "+i);
			}
		}

	}

}
