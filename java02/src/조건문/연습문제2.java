package 조건문;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {

		String password = JOptionPane.showInputDialog("암호를 대시오.");

		if (password.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요");
		}
		
		//switch쓸때 case "자장면": 
		//switch int char string
		String menu = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴는?");

		if (menu.equals("자장면")) {
			System.out.println("중국집으로 가요");
		} else if (menu.equals("라면")) {
			System.out.println("분식집으로 가요");
		} else if (menu.equals("회")) {
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}

		String data1 = JOptionPane.showInputDialog("첫번째 정수를 입력하세요");
		String data2 = JOptionPane.showInputDialog("두번째 정수를 입력하세요");

		int num1 = Integer.parseInt(data1);
		int num2 = Integer.parseInt(data2);

		if (num1 > num2) {
			System.out.println("첫번째 정수가 더 큽니다.");

		} else {
			System.out.println("두번째 정수가 더 큽니다.");
		}

		String no = "A100EX";

		char first = no.charAt(0);// 첫번째 자리에 있는 문자 하나 추출

		switch (first) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
		default:
			System.out.println("해당부서없음");
			break;
		}

	}

}
