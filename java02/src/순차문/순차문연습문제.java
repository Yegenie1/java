package 순차문;

import javax.swing.JOptionPane;

public class 순차문연습문제 {

	public static void main(String[] args) {
		// 입력
		String height = JOptionPane.showInputDialog("당신의 신장은?");
		String weight = JOptionPane.showInputDialog("당신의 체중은?");

		// 처리
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		double bmi = weight1 / (height1 * height1 * 0.0001);

		// 출력
		System.out.println(bmi);
		JOptionPane.showMessageDialog(null, bmi);
	}

}
