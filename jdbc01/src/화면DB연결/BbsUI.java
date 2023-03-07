package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI {

	public static void main(String[] args) {
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
		
		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");
		JButton b3 = new JButton("게시물 삭제 완료");		
		JButton b4 = new JButton("게시물 검색 완료");
		
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
