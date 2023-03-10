package project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MUSICMYlistgoodmanage중복 {

	public void open() {
		String str = "";

		try {
			BufferedReader reader = new BufferedReader(new FileReader("./userID.txt"));

			try {
				str = reader.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String user = str;
		
		JFrame f = new JFrame();
		f.setTitle("MY LIST 좋아요 관리");
		f.setSize(600, 500);

		JButton b1 = new JButton("음악등록");
		JButton b2 = new JButton("음악삭제");
		// JButton b3 = new JButton("중복");
		JButton b4 = new JButton("등록삭제수정");
		JButton b5 = new JButton("MYLIST");

		JLabel l1 = new JLabel("<<<< MY LIST 좋아요 관리 >>>>");
		JLabel l2 = new JLabel("노래 ID로 좋아요 LIST 관리하기");
		JLabel l3 = new JLabel("노래 ID");

		JTextField t1 = new JTextField(10);

		// INSERT기능
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("음악등록처리");
				String MUSIC_ID = t1.getText();
				
				if (MUSIC_ID.equals("")) { // 기본형 4가지만 == 로 값을 비교 가능!
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				MUSICgoodlist중복확인DAO dao = new MUSICgoodlist중복확인DAO();
				// 1. 가방을 만들어주세요.
				MUSICgoodlist중복확인VO bag = new MUSICgoodlist중복확인VO();
				// 2. 가방에 값들을 넣어주세요.
				bag.setMUSIC_ID(MUSIC_ID);
				bag.setUSER_ID(user);

				// 3. 값들이 들어있는 가방을 전달하자.
				int r = dao.check(bag); // 1 , 0
				if (r == 0) {

					int result = dao.insert(bag);// 1 or 0

					if (result == 1) {
						JOptionPane.showMessageDialog(f, "좋아요 등록 성공" + user);
					} else {
						JOptionPane.showMessageDialog(f, "좋아요 등록 실패, 재입력해주세요.");
					}
				} else {
					JOptionPane.showMessageDialog(f, "중복된 아이디 입니다.");
				}

			}// action
		}); // b1

		// 삭제
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("음악 삭제처리");
				String MUSIC_ID = t1.getText();
				mylistUI u = new mylistUI();
				
				MUSICgoodlist중복확인DAO dao = new MUSICgoodlist중복확인DAO();
				MUSICgoodlist중복확인VO bag = new MUSICgoodlist중복확인VO(); // 1.가방을 만들어주세요.
				bag.setMUSIC_ID(MUSIC_ID); // 2. 가방에 데이터를 넣어주세요.
				bag.setUSER_ID(user);
				
				int result = dao.delete(bag); // 3. 가방을 전달해주세요.
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "음악삭제 성공");
				} else {
					JOptionPane.showMessageDialog(f, "음악삭제 실패, 재입력해주세요.");
				}
			}// action
		}); // b2

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ManagemusicUI ui = new ManagemusicUI();
				ui.open();
				f.setVisible(false);
			}
		});
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mylistUI ui = new mylistUI();
				ui.open();
				f.setVisible(false);
			}
		});

		// f에 위에 있는 요소들을 add로 붙여주어야하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		// 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 40);

		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		/// 조립을 시작해보자. ///
		f.setLayout(flow);

		f.add(b4);
		f.add(b5);

		f.add(l1);

		f.add(l2);

		f.add(l3);
		f.add(t1);

		f.add(b1);
		f.add(b2); 


		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		// b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

		t1.setBackground(Color.WHITE);
		t1.setForeground(Color.blue);


		b1.setBackground(Color.WHITE); // 배경색
		b1.setForeground(Color.red); // 글자색
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.red);


		f.getContentPane();
		// 맨 끝으로~~~~~
		f.setVisible(true);

	}
}
