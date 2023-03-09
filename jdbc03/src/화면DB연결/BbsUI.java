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

import 자바DB연결.BbsDAO;
import 자바DB연결.MemberDAO4;

public class BbsUI {

	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(450,900);
		
		JLabel l1 = new JLabel("  나의 게시판    ");
		JLabel l_ = new JLabel("----------------------------");
		JLabel l_2 = new JLabel("----------------------------");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성하기");
		JButton b2 = new JButton("게시물 삭제하기");
		JButton b3 = new JButton("게시물 수정하기");		
		JButton b4 = new JButton("게시물 검색하기");
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 작성 완료");
				String NO = t1.getText();
				int no2 = Integer.parseInt(NO);
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();

				BbsDAO dao = new BbsDAO();
				//1. 가방을 만들어주세요
				BbsVO bag = new BbsVO();
				//2. 가방에 값들을 넣어주세요
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				//3. 값들이 들어있는 가방을 전달하자
				int result = dao.insert(bag);
				if (result==1) {
					JOptionPane.showMessageDialog(f, "게시물 작성 성공");
					
				} else {
					JOptionPane.showMessageDialog(f, "게시물 작성 실패 -재입력해주세요");

				}

			}// action
		});/// b1
		
		//자바는 변수에 들어갈 데이터 타입 변수명을 써주어야 ram에 저장공간이 만들어진다 
		//String test = null; ==>선언!!
		//자바는 선언시 변수가 만들어진다
		//자바는 선언시 변수에 들어갈 타입도 결정!
		//인터페이스는 변수선언불가!
		
		//검색기능
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 삭제 완료");
				String NO = t1.getText();
				int no2 = Integer.parseInt(NO);
				
				BbsDAO dao = new BbsDAO();
				int result = dao.delete(no2);
				if (result>=1) {
					JOptionPane.showMessageDialog(f, "게시물 삭제 성공");
					
				} else {
					JOptionPane.showMessageDialog(f, "게시물 삭제 실패 -재입력해주세요");

				}

			}// action
		});
		//수정
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시물 수정 처리");
				String NO = t1.getText();
				int no2 = Integer.parseInt(NO);
				String content = t3.getText();

				BbsDAO dao = new BbsDAO();
				//1. 가방을 만들어주세요
				BbsVO bag = new BbsVO();
				//2. 가방에 값들을 넣어주세요
				bag.setNo(no2);
				bag.setContent(content);
				//3. 값들이 들어있는 가방을 전달하자
				int result = dao.update(bag);
				
			
				if (result>=1) {
					JOptionPane.showMessageDialog(f, "게시물 수정 성공");
					
				} else {
					JOptionPane.showMessageDialog(f, "게시물 수정 실패 -재입력해주세요");

				}

			}// action
		});
		
		
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("회원검색처리");
				String NO = t1.getText();
				int no2 = Integer.parseInt(NO);
				
				BbsDAO dao = new BbsDAO();
				//1. 가방을 만들어주세요
				BbsVO bag = dao.one(no2);
				//2. 가방에 값들을 넣어주세요
			
				if (bag != null) {
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());
				t2.setBackground(Color.pink);
				t3.setBackground(Color.pink);
				t4.setBackground(Color.pink);
				}else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			}// action
		});
		
		//f에 위에 있는 요소들을 add로 붙여줘야하는데 
		//붙이는 순서대로 물흐르듯이 붙임
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font 부품 필요
		Font font = new Font("돋음",Font.BOLD,45);
		Font font1 = new Font("돋음",Font.BOLD,35);
		
		
		/////////필요한 부품(객체)를 ram에 가져다 놓고 준비 끝////////////
		
		
		
		f.setLayout(flow);
	
		f.add(l1);f.add(l_);
		f.add(l2);f.add(t1);
		f.add(l3);f.add(t2);
		f.add(l4);f.add(t3);
		f.add(l5);f.add(t4);
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
