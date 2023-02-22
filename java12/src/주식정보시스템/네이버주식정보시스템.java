package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 450);
		f.getContentPane().setBackground(Color.red);
		f.setLayout(new FlowLayout());

		Font font = new Font("궁서", 1, 40);
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카카오");
		JButton b3 = new JButton("네이버");
		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.cyan);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.green);
		b4.setBackground(Color.pink);

		// 액션기능
		// 1) 액션기능추가
		// 2) 클릭했을 때 누가 담당할지 부품을 만들어주기
		// 3) 클릭했을 떄 어떻게 처리할지

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드 005930을 주면서 크롤링하는 부품에게 크롤링기능요청
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				System.out.println("삼성전자");
				c.naver("005930");

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드 005930을 주면서 크롤링하는 부품에게 크롤링기능요청
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				System.out.println("카카오");
				c.naver("035720");

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드 005930을 주면서 크롤링하는 부품에게 크롤링기능요청
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				System.out.println("네이버");
				c.naver("035420");

			}
		});

		JLabel label = new JLabel("★code★");
		label.setFont(font);

		JTextField text = new JTextField(7);
		text.setFont(font);
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드 005930을 주면서 크롤링하는 부품에게 크롤링기능요청
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				String code3 = text.getText();
				
				c.naver(code3);

			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);

	}

}
