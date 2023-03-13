package miniproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinUI {

	public void open() {
		JFrame f = new JFrame();
		f.setTitle("계정관리");
		f.setSize(340, 500);

		JLabel l0 = new JLabel("  계정관리 화면     ");

		JLabel l1 = new JLabel("유저이름");
		JLabel l11 = new JLabel("생년월일");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("비밀번호");
		JLabel l4 = new JLabel("비밀번호 확인");


		JTextField t1 = new JTextField(10);
		JTextField t11 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		

		JButton b1 = new JButton("계정관리");
		JButton b2 = new JButton("로그인");

		JButton b3 = new JButton("회원가입하기");
		JButton b4 = new JButton("회원삭제하기");
		JButton b5 = new JButton("비밀번호변경");
		JButton b6 = new JButton("회원정보찾기");
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loginUI login = new loginUI();
				login.open();
				f.setVisible(false);
			}
		});
		
		

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원가입처리");
				String id = t2.getText();
				String pw = t3.getText();
				String pw_con = t4.getText();
				String name = t1.getText();
				String birth = t11.getText();

				if (id.equals("") || pw.equals("")) {// 기본형4가지만 == 로 값을 비교 가능
					JOptionPane.showMessageDialog(f, "id와 pw는 필수 입력 항목입니다.");
				} else {
					UserDAO dao = new UserDAO();
					// 1. 가방을 만들어주세요
					UserVO bag = new UserVO();
					// 2. 가방에 값들을 넣어주세요
					bag.setId(id);
					bag.setPw(pw);
					bag.setName(name);
					bag.setBirth(birth);
					// 3. 값들이 들어있는 가방을 전달하자
					if (pw.equals(pw_con)) {
						int result = dao.insert(bag);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "회원가입 성공");
						} else {
							JOptionPane.showMessageDialog(f, "회원가입 실패 -재입력해주세요");
						}
					} else {
						JOptionPane.showMessageDialog(f, "pw를 확인해주세요.");

					}
				}

				

			}// 회원가입
		});/// b3

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원탈퇴처리");
				String id = t2.getText();

				UserDAO dao = new UserDAO();
				int result = dao.delete(id);
				if (result >= 1) {
					JOptionPane.showMessageDialog(f, "회원 삭제 성공");

				}
				else {
					JOptionPane.showMessageDialog(f, "회원 삭제 실패 -재입력해주세요");

				}

			}// action
		});

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("비밀번호 변경");
				String id = t2.getText();
				String pw = t3.getText();
				String pw_con = t4.getText();

				UserDAO dao = new UserDAO();
				// 1. 가방만들기
				UserVO bag = new UserVO();
				// 2. 가방에 값을 넣기
				bag.setId(id);
				bag.setPw(pw);
				// 가방을 전달하자
				if (pw.equals(pw_con)) {
					int result = dao.update(bag);
					if (result >= 1) {
						JOptionPane.showMessageDialog(f, "회원수정 성공");
					} 
					else {
						JOptionPane.showMessageDialog(f, "회원가입 실패 -재입력해주세요");
					}
				} else {
					JOptionPane.showMessageDialog(f, "pw를 확인해주세요.");

				}

			}// action
		});

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원정보찾기");
				String id = t2.getText();

				UserDAO dao = new UserDAO();
				UserVO bag = dao.read(id);
				if (bag != null) {
					t3.setText(bag.getPw());
					t1.setText(bag.getName());
					t11.setText(bag.getBirth());
					t1.setBackground(Color.pink);
					t11.setBackground(Color.pink);
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
				} else {
					
					t11.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			}// action
		});

		// f에 위에 있는 요소들을 add로 붙여줘야하는데
		// 붙이는 순서대로 물흐르듯이 붙임
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font 부품 필요
		Font font = new Font("돋음", Font.BOLD, 30);
		Font font1 = new Font("돋음", Font.BOLD, 20);

		///////// 필요한 부품(객체)를 ram에 가져다 놓고 준비 끝////////////

		f.setLayout(flow);

		f.add(b1);
		f.add(b2);
		f.add(l0);
		f.add(l1);
		f.add(t1);
		f.add(l11);
		f.add(t11);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		l0.setFont(font);
		l1.setFont(font1);
		l11.setFont(font1);
		l2.setFont(font1);
		l3.setFont(font1);
		l4.setFont(font1);
		t1.setFont(font1);
		t11.setFont(font1);
		t2.setFont(font1);
		t3.setFont(font1);
		t4.setFont(font1);
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font1);
		b5.setFont(font1);
		b6.setFont(font1);

		
		b1.setBackground(Color.lightGray);
		b1.setForeground(Color.white);
		b2.setBackground(Color.lightGray);
		b2.setForeground(Color.white);

		b3.setBackground(Color.red);
		b3.setForeground(Color.blue);
		b4.setBackground(Color.orange);
		b4.setForeground(Color.blue);
		b5.setBackground(Color.yellow);
		b5.setForeground(Color.blue);
		b6.setBackground(Color.green);
		b6.setForeground(Color.blue);

		f.getContentPane().setBackground(Color.white);

		f.setVisible(true);

	}

}
