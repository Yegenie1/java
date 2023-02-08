package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주써서 ram에 언제든 사용할 수 있도록 준비되어 있음.
		// 부품명.기능()

		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 ram에 저장해두고 사용
		// JFrame f= new JFrame();
		
		JFrame f = new JFrame();
		JLabel l = new JLabel(); //윗글자
		JTextField text = new JTextField(5);
		JButton b = new JButton(); //버튼
		FlowLayout flow = new FlowLayout();
		Font font = new Font("돋음", 1, 20);
		Font font2 = new Font("D2coding", 1, 30);
		
		f.setSize(400,500);
		f.getContentPane().setBackground(Color.yellow);
		f.setLayout(flow);
		//윗부분 글자들어가는 부분
		l.setText("당신이 생각한 숫자를 입력하세요.");
		l.setFont(font);
		l.setForeground(Color.darkGray);
		//입력란
		text.setFont(font2);
		//버튼
		b.setText("숫자맞추기!");
		b.setBackground(Color.blue);
		b.setForeground(Color.white);
		b.setFont(font2);
		//add
		f.add(l); //f라는 부품위에 조립해서 올려놔라
		f.add(text);
		f.add(b);
		
		//맨 아래에!!
		f.setVisible(true);
		
		
		
		
		
		

	}

}
