package 반복문;

import javax.swing.JOptionPane;

public class 누적 {

	public static void main(String[] args) {
		// 숫자누적
		// 글자누적
		int sum = 0;// 변수의 초기화

		for (int i = 1; i <= 1000; i++) {
			sum = sum + i;
			// System.out.println("현재까지의 합>> " + sum);
		}
		System.out.println(sum);

		String sum2 = "";// String의 초기값은 ""
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가고싶은 곳 입력");
			sum2 = sum2 + data + " ";

		}
		System.out.println(sum2);
	}

}
