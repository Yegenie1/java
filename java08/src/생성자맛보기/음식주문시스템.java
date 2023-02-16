package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식주문시스템 {

	static int count;
	static int count1;
	static int count2;
	static int count3;

	final static int FINALPRICE1 = 3500; // final은 변경불가, 상수
	final static int FINALPRICE2 = 3000;
	final static int FINALPRICE3 = 4000;
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로 쓰기를 권장

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(550, 500);
		f.getContentPane().setBackground(Color.lightGray);
		f.setTitle("음식주문시스템");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("돋음", Font.BOLD, 40);
		Font font2 = new Font("돋음", Font.BOLD, 25);

		JLabel text1 = new JLabel("총 개수 : ");
		text1.setFont(font2);

		JLabel text2 = new JLabel("짬뽕 : 0 ,우동 : 0, 짜장 : 0");
		text2.setFont(font2);

		JLabel price = new JLabel("결제금액 0원");
		price.setFont(font);

		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("home.jpg");
		center.setIcon(icon);

		JLabel sum = new JLabel();
		sum.getText();
		sum.setFont(font2);

		JButton a = new JButton("짬뽕");
		a.setFont(font2);
		a.setBackground(Color.pink);
		a.setBorderPainted(false);
		f.add(a);

		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("a.jpg");
				center.setIcon(icon);
				count1++;
				count++;
				sum.setText(count + "개");
				price.setText("총 결제금액 : " + (count1 * FINALPRICE1 + count2 * FINALPRICE2 + count3 * FINALPRICE3) + "원");
				text2.setText("짬뽕 :" + count1 + ",우동 : " + count2 + ", 짜장 : " + count3);

			}
		});

		JButton b = new JButton("우동");
		b.setFont(font2);
		b.setBackground(Color.yellow);
		b.setBorderPainted(false);
		f.add(b);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("b.jpg");
				center.setIcon(icon);
				count2++;
				count++;
				sum.setText(count + "개");
				price.setText("총 결제금액 : " + (count1 * FINALPRICE1 + count2 * FINALPRICE2 + count3 * FINALPRICE3) + "원");
				text2.setText("짬뽕 :" + count1 + ",우동 : " + count2 + ", 짜장 : " + count3);

			}
		});

		JButton c = new JButton("짜장");
		c.setFont(font2);
		c.setBackground(Color.orange);
		c.setBorderPainted(false);
		f.add(c);

		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("c.jpg");
				center.setIcon(icon);
				count3++;
				count++;
				sum.setText(count + "개");
				price.setText("총 결제금액 : " + (count1 * FINALPRICE1 + count2 * FINALPRICE2 + count3 * FINALPRICE3) + "원");
				text2.setText("짬뽕 :" + count1 + ",우동 : " + count2 + ", 짜장 : " + count3);

			}
		});

		f.add(text1);
		f.add(sum);
		f.add(text2);
		f.add(center);
		f.add(price);

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
