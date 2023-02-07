package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.*; swing아래 많은 것을 쓰겠다

public class 부품만들기2 {

	public static void main(String[] args) {

		// JFrame
		JFrame f = new JFrame();
		f.setSize(500, 150);

		// 물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야함.
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		// f에 물흐르듯이 배치해주는 부품을 쓰겠다고 조립 (설정)
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("버튼만들기!!");

		JButton b2 = new JButton();
		b2.setText("버튼만들기2!!");

		JLabel text1 = new JLabel();
		text1.setText("아이디");
		JLabel pw1 = new JLabel();
		pw1.setText("패스워드");

		// 글자 넣는 곳...
		JTextField input1 = new JTextField(10);// 몇글자 쓸지 적어야됨
		JTextField input2 = new JTextField(10);

		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		pw1.setFont(font);
		input2.setFont(font);
		b2.setFont(font);

		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(pw1);
		f.add(input2);
		f.add(b2);

		f.setVisible(true);

	}

}
