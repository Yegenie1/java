package project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class loginUI {

	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setTitle("음악 홈페이지 로그인 화면");
		f.setSize(600, 500);

		JButton b1 = new JButton("Login");
		JButton b2 = new JButton("계정관리");
		JButton b3 = new JButton("로그인");

		JLabel l1 = new JLabel("<<<< 로그인화면 >>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 40);

		/// 조립을 시작해보자. ///
		f.setLayout(flow);

		f.add(b2);f.add(b3);
		f.add(l1);
		f.add(l2);f.add(t1);
		f.add(l3);f.add(t2);

		f.add(b1);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		b1.setFont(font);

		t1.setBackground(Color.WHITE);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.WHITE);
		t2.setForeground(Color.blue);

		b1.setBackground(Color.WHITE); // 배경색
		b1.setForeground(Color.red); // 글자색
		
		b1.addActionListener(new ActionListener() {
			int result = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인처리");
				String id = t1.getText();
				String pw = t2.getText();
				loginVO bag = new loginVO();
				bag.setId(id);
				bag.setPw(pw);
				mylistUI ui = new mylistUI();
				if (bag != null) {
					loginDAO dao = new loginDAO();
					result = dao.login(bag);
				} 
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					try {
						File f = new File("./userID.txt");  
						String text = t1.getText();
				        
				        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(f));  
				        
				        // 파일 쓰기  
				        buffWrite.write(text, 0, text.length());  
				        // 파일 닫기  
				        buffWrite.flush();  
				        buffWrite.close();  
				        System.out.println("입력완료");
					} catch (Exception e1) {
						System.out.println(e1);
					}
					ui.open();
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}// action
		}); 
		
		b2.addActionListener(new ActionListener() { // 게정관리
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinUI j = new JoinUI();
				j.open();
				f.setVisible(false);
			}
		});
		f.setVisible(true);
	}
	
	
	public void open() {
		
		JFrame f = new JFrame();
		f.setTitle("음악 홈페이지 로그인 화면");
		f.setSize(600, 500);

		JButton b1 = new JButton("Login");
		JButton b2 = new JButton("계정관리");
		JButton b3 = new JButton("로그인");

		JLabel l1 = new JLabel("<<<< 로그인화면 >>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 40);

		/// 조립을 시작해보자. ///
		f.setLayout(flow);

		f.add(b2);f.add(b3);
		f.add(l1);
		f.add(l2);f.add(t1);
		f.add(l3);f.add(t2);

		f.add(b1);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		b1.setFont(font);

		t1.setBackground(Color.WHITE);
		t1.setForeground(Color.blue);
		t2.setBackground(Color.WHITE);
		t2.setForeground(Color.blue);

		b1.setBackground(Color.WHITE); // 배경색
		b1.setForeground(Color.red); // 글자색
		
		b1.addActionListener(new ActionListener() {
			int result = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인처리");
				String id = t1.getText();
				String pw = t2.getText();
				loginVO bag = new loginVO();
				bag.setId(id);
				bag.setPw(pw);
				mylistUI ui = new mylistUI();
				if (bag != null) {
					loginDAO dao = new loginDAO();
					result = dao.login(bag);
				} 
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					bag.setUser(t1.getText());
					ui.open();
					f.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}// action
		}); 
		
		b2.addActionListener(new ActionListener() { // 게정관리
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JoinUI j = new JoinUI();
				j.open();
				f.setVisible(false);
			}
		});
		f.setVisible(true);
	}
	
	 
}
