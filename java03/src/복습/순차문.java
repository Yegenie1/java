package 복습;

import javax.swing.JOptionPane;
//JOptionPane이 javax폴더 아래 swing폴더 아래에 있음을 알려줌

public class 순차문 {

	public static void main(String[] args) {
		// 입력 ---> 처리---> 출력
		// 두개의 숫자를 입력 받아서 처리해서 출력
		// 프로그래밍은 손으로 치는 값은 모두다 스트링으로 취급(문자열)
		// 램에 저장공간을 만드는 것==>선언
		// 선언할 떄 램에 저장공간인 변수가 만들어진다.
		// 데이터타입 변수명 = 값

		// 입력
		String x = JOptionPane.showInputDialog("숫자1 입력");
		String y = JOptionPane.showInputDialog("숫자2 입력");
		// 처리
		// 정수로 바꾸어서 처리를 하고 싶으면, 프로그래머가 정수로 바꾸어주는 부품을 써서 처리를 해야함.
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);

		// 출력
		// 자바언어는 정수와 정수의 연산의 결과는 무조건 정수!
		// 자바언어는 하나라도 실수이면 결과는 무조건 실수!
		//System.out.println((double)num1 / num2);
		System.out.printf("%3f",(double)num1 / num2);

	}

}
