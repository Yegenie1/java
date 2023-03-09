package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO4;

public class StartUI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		MemberDAO4 dao = new MemberDAO4();
		//1. 가방만들기
		MemberVO bag = new MemberVO();
		//2. 가방에 값을 넣기
		bag.setId(id);
		bag.setPw(pw);
		//가방을 전달하자
		int result = dao.login(bag);
		if (result==0) {
			JOptionPane.showMessageDialog(null, "로그인 실패");
			MemberUI2 member = new MemberUI2();
			member.open();
		} else {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI bbs = new BbsUI();
			bbs.open();
		}
	
	}

}
