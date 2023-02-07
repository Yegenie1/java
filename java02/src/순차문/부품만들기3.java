package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.*; swing아래 많은 것을 쓰겠다

public class 부품만들기3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(500, 150);
		
		FlowLayout flow =new FlowLayout();
		
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
		
		//import가 안된 경우 Font위에 마우스를 올리면 (또는 F2)
		//import Font~~~클릭
		//컨트롤 쉬프트 o
		Font font = new Font("돋음", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		pw1.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.MAGENTA);
		b1.setForeground(Color.white);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		input1.setBackground(Color.CYAN);
		input1.setForeground(Color.white);
		input2.setBackground(Color.blue);
		input2.setForeground(Color.white);
		
		ImageIcon icon = new ImageIcon("007.png");
		ImageIcon icon2 = new ImageIcon("m.png");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);

		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(pw1);
		f.add(input2);
		f.add(b2);

		f.setVisible(true);

	}

}
