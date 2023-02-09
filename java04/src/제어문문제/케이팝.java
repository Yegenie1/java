package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class 케이팝 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 900);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel l = new JLabel();
		l.setText("노래 인기 투표");

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();


		ImageIcon icon1 = new ImageIcon("a.png");
		b1.setIcon(icon1);
		ImageIcon icon2 = new ImageIcon("b.png");
		b2.setIcon(icon2);
		ImageIcon icon3 = new ImageIcon("c.png");
		b3.setIcon(icon3);


		JLabel text1 = new JLabel();
		text1.setText("아이유-라일락");
		JLabel text11 = new JLabel();
		JLabel text2 = new JLabel();
		text2.setText("프로미스나인-we go");
		JLabel text22 = new JLabel();
		JLabel text3 = new JLabel();
		text3.setText("스테이씨-ASAP");
		JLabel text33 = new JLabel();

		Font font = new Font("돋음", 1, 30);
		Font font2 = new Font("바탕", 1, 20);

		l.setFont(font);
		text1.setFont(font2);
		text2.setFont(font2);
		text3.setFont(font2);
		text11.setFont(font);
		text22.setFont(font);
		text33.setFont(font);


		f.add(l);
		f.add(b1);
		f.add(text1);
		f.add(text11);
		f.add(b2);
		f.add(text2);
		f.add(text22);
		f.add(b3);
		f.add(text3);
		f.add(text33);



		b1.addActionListener(new ActionListener() {
			int a = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				a++;
				text11.setText(a + "표");

			}
		});
		b2.addActionListener(new ActionListener() {
			int b = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				b++;
				text22.setText(b + "표");

			}
		});
		b3.addActionListener(new ActionListener() {
			int c = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				c++;
				text33.setText(c + "표");

			}
		});
		
		

		f.setVisible(true);
	}

}
