package 제어문;

import javax.swing.JOptionPane;

//컨트롤 쉬프트 O 자동 임포트

public class 순차문2 {

	public static void main(String[] args) {
		// 입력
		String exercise = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");

		// 처리
		String result = day + "에 저는 " + exercise + "를 합니다.";

		// 출력
		System.out.println(result);
	}

}
