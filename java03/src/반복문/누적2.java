package 반복문;

import javax.swing.JOptionPane;

public class 누적2 {

	public static void main(String[] args) {
		// 1.숫자누적 300까지 5의 배수
		int sum = 0;

		for (int i = 5; i <= 300; i++) {
			if (i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("300까지 5의 배수를 더한 값은 >> " + sum);

		// 2.문자누적
		String sum2 = " ";
		for (int i = 1; i <= 4; i++) {
			String data = JOptionPane.showInputDialog("먹고싶은 음식이 뭐야?");
			sum2 = sum2 + data + "랑 ";
		}
		System.out.println("먹고 싶은 음식 >>" + sum2);
	}

}
