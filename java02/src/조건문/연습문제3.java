package 조건문;

import javax.swing.JOptionPane;

public class 연습문제3 {

	public static void main(String[] args) {
//		1.두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		String data1 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요");
		String data2 = JOptionPane.showInputDialog("두번째 정수를 입력하세요");
		String data3 = JOptionPane.showInputDialog("사칙연산자를 입력하세요");

		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);
		
		double result = (double)num1 / (double)num2;

		switch (data3) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.printf("%.2f", result);
			break;

		}

		// 2. 두 수를 입력받아 정수로 변환하여 정수변수에 저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!

		
	}

}
