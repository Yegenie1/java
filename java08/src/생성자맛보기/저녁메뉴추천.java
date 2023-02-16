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

public class 저녁메뉴추천 {

	static int count;
	static int count1;
	static int count2;
	static int count3;
	static int count4;
	static int count5;
	static int count6;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(700, 450);
		f.getContentPane().setBackground(Color.lightGray);
		f.setTitle("저녁메뉴추천");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("돋음", Font.ITALIC, 30);
		Font font2 = new Font("돋음", Font.BOLD, 25);

		JLabel text1 = new JLabel("투표수 : ");
		text1.setFont(font);

		JLabel text2 = new JLabel("치킨 : 0 ,피자 : 0, 찜닭 : 0, 떡볶이 : 0, 초밥 : 0, 스테이크 : 0");
		text2.setFont(font2);

		JLabel text3 = new JLabel("가장 많이 투표된 것을 드세요!");
		text3.setFont(font2);

		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon("c.jpg");
		center.setIcon(icon);

		JLabel sum = new JLabel();
		sum.getText();
		sum.setFont(font2);

		JButton a = new JButton("치킨");
		a.setFont(font2);
		a.setBackground(Color.pink);
		a.setBorderPainted(false);
		f.add(a);

		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("d.jpg");
				center.setIcon(icon);
				count1++;
				count++;
				sum.setText(count + "");
				text2.setText("치킨 : " + count1 + "피자 :" + count2 + "찜닭 :" + count3 + "떡볶이 : " + count4 + " 초밥 :"
						+ count5 + " 스테이크 : " + count6);

			}
		});

		JButton b = new JButton("피자");
		b.setFont(font2);
		b.setBackground(Color.yellow);
		b.setBorderPainted(false);
		f.add(b);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("e.jpg");
				center.setIcon(icon);
				count2++;
				count++;
				sum.setText(count + "");
				text2.setText("치킨 : " + count1 + "피자 :" + count2 + "찜닭 :" + count3 + "떡볶이 : " + count4 + " 초밥 :"
						+ count5 + " 스테이크 : " + count6);

			}
		});

		JButton c = new JButton("찜닭");
		c.setFont(font2);
		c.setBackground(Color.orange);
		c.setBorderPainted(false);
		f.add(c);

		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("f.jpg");
				center.setIcon(icon);
				count3++;
				count++;
				sum.setText(count + " ");
				text2.setText("치킨 : " + count1 + "피자 :" + count2 + "찜닭 :" + count3 + "떡볶이 : " + count4 + " 초밥 :"
						+ count5 + " 스테이크 : " + count6);

			}
		});
		JButton d = new JButton("떡볶이");
		d.setFont(font2);
		d.setBackground(Color.white);
		d.setBorderPainted(false);
		f.add(d);
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("g.jpg");
				center.setIcon(icon);
				count4++;
				count++;
				sum.setText(count + " ");
				text2.setText("치킨 : " + count1 + "피자 :" + count2 + "찜닭 :" + count3 + "떡볶이 : " + count4 + " 초밥 :"
						+ count5 + " 스테이크 : " + count6);

			}
		});
		JButton e = new JButton("초밥");
		e.setFont(font2);
		e.setBackground(Color.green);
		e.setBorderPainted(false);
		f.add(e);

		e.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("h.jpg");
				center.setIcon(icon);
				count5++;
				count++;
				sum.setText(count + "");
				text2.setText("치킨 : " + count1 + "피자 :" + count2 + "찜닭 :" + count3 + "떡볶이 : " + count4 + " 초밥 :"
						+ count5 + " 스테이크 : " + count6);

			}
		});
		JButton n = new JButton("스테이크");
		n.setFont(font2);
		n.setBackground(Color.blue);
		n.setBorderPainted(false);
		f.add(n);

		n.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("i.jpg");
				center.setIcon(icon);
				count6++;
				count++;
				sum.setText(count + "");
				text2.setText("치킨 : " + count1 + "피자 :" + count2 + "찜닭 :" + count3 + "떡볶이 : " + count4 + " 초밥 :"
						+ count5 + " 스테이크 : " + count6);

			}
		});

		f.add(text1);
		f.add(sum);
		f.add(text2);
		f.add(center);
		f.add(text3);

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
