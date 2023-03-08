package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(560, 600);

		JLabel l1 = new JLabel("         회원가입화면            ");
		JLabel l_ = new JLabel("---------------------------------------");
		JLabel l_2 = new JLabel("---------------------------------------");
		JLabel l2 = new JLabel("아  이  디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이        름");
		JLabel l5 = new JLabel("전화번호");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입 처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				if (id.equals("")) {//기본형4가지만 == 로 값을 비교 가능
					JOptionPane.showMessageDialog(f, "id는 필수 입력 항목입니다.");
				}

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.insert(id, pw, name, tel);
				if (result==1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
					
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패 -재입력해주세요");

				}

			}// action
		});/// b1
		//삭제
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t1.getText();
			
				MemberDAO2 dao = new MemberDAO2();
				int result = dao.delete(id);
				if (result>=1) {
					JOptionPane.showMessageDialog(f, "회원 삭제 성공");
					
				} else {
					JOptionPane.showMessageDialog(f, "회원 삭제 실패 -재입력해주세요");

				}

			}// action
		});
		//수정
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원수정 처리");
				String id = t1.getText();
				String tel = t4.getText();

				MemberDAO2 dao = new MemberDAO2();
				int result = dao.update(id, tel);
				if (result>=1) {
					JOptionPane.showMessageDialog(f, "회원수정 성공");
					
				} else {
					JOptionPane.showMessageDialog(f, "회원수정 실패 -재입력해주세요");

				}

			}// action
		});

		// f에 위에 있는 요소들을 add로 붙여줘야하는데
		// 붙이는 순서대로 물흐르듯이 붙임
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font 부품 필요
		Font font = new Font("돋음", Font.BOLD, 45);
		Font font1 = new Font("돋음", Font.BOLD, 35);

		///////// 필요한 부품(객체)를 ram에 가져다 놓고 준비 끝////////////

		f.setLayout(flow);

		f.add(l1);
		f.add(l_);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(l_2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		l1.setFont(font);
		l_.setFont(font);
		l_2.setFont(font);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);
		l5.setFont(font1);
		t1.setFont(font1);
		t2.setFont(font1);
		t3.setFont(font1);
		t4.setFont(font1);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);

		t1.setForeground(Color.DARK_GRAY);
		t2.setForeground(Color.DARK_GRAY);
		t3.setForeground(Color.DARK_GRAY);
		t4.setForeground(Color.DARK_GRAY);

		b1.setBackground(Color.red);
		b1.setForeground(Color.blue);
		b2.setBackground(Color.orange);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.green);
		b4.setForeground(Color.blue);

		f.getContentPane().setBackground(Color.cyan);

		f.setVisible(true);

	}

}
