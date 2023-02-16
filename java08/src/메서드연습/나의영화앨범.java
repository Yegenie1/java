package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 0;

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "001.png", "002.png", "003.png", "004.png", "005.png" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		f.setSize(460, 560);
		f.getContentPane().setBackground(Color.green);

		Font font = new Font("궁서", Font.BOLD, 40); // 객체생성를 하는데, 특정한 입력값을 넣지 않으면 못만들게 할 수 있음
		Font font2 = new Font("궁서", Font.BOLD, 25);

		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃을 사용하도록 셋팅
		// BorderLayout
		JLabel top = new JLabel(title[0]);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH);
		top.setHorizontalAlignment(0);

		JLabel center = new JLabel("포스터");
		ImageIcon icon = new ImageIcon(img[0]);
		center.setIcon(icon);
		center.setFont(font);
		f.add(center, BorderLayout.CENTER);

		// String.valueOf() : String으로 변환
		// Integer.parse() : int로 변환
		// double.parse() : double로 변환
		JLabel under = new JLabel("영화평점" + String.valueOf(jumsu[0]));
		under.setForeground(Color.orange);
		under.setHorizontalAlignment(0);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<");
		left.setBackground(Color.pink);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index==0) {
					JOptionPane.showMessageDialog(f, "이전장이 없습니다");
				} else {

					// 현재 인덱스 값보다 하나 적은 값들로 top center under을 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index -1 ]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--;// index = index -1; index -=1;
				}
			}
		});

		JButton right = new JButton(">>");
		right.setBackground(Color.pink);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index==title.length-1) {
					JOptionPane.showMessageDialog(f, "다음 장이 없습니다");
				} else {

					// 현재 인덱스 값보다 하나 적은 값들로 top center under을 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index +1 ]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++;// index = index +1; index +=1;
				}

			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
