package 조건문;

import javax.swing.JOptionPane;

public class 인기조사2 {

	public static void main(String[] args) {
		// 인기투표
		// 1)유재석 2)박명수 3)정준하

		int yoo = 0;
		int park = 0;
		int jung = 0;

		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표 1)유재석 2)박명수 3)정준하");
			if (data.equals("1")) {
				yoo++;
			} else if (data.equals("2")) {
				park++;
			} else if (data.equals("3")) {
				jung++;
			}
		}

		System.out.println("유재석에게 투표한 사람 : " + yoo + "명");
		System.out.println("박명수에게 투표한 사람 : " + park + "명");
		System.out.println("정준하에게 투표한 사람 : " + jung + "명");
	}

}
