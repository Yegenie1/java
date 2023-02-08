package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼에반복문 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(250, 350);
		f.getContentPane().setBackground(Color.yellow);

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("별 10개");

		JButton b2 = new JButton();
		b2.setText("커피*5");

		JButton b3 = new JButton();
		b3.setText("커피*우유3");

		JButton b4 = new JButton();
		b4.setText("1:짱!");

		// import가 안된 경우 Font위에 마우스를 올리면 (또는 F2)
		// import Font~~~클릭
		// 컨트롤 쉬프트 o
		Font font = new Font("D2Coding", 1, 30);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		b1.setBackground(Color.pink);
		b1.setForeground(Color.white);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.white);
		b4.setBackground(Color.blue);
		b4.setForeground(Color.white);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 버튼에다가 액션기능을 추가하겠다고 설정
		// 클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.printf("*");

				}
				System.out.println("");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.printf("커피*");
				}

				System.out.println("");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
				// 4
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println(i + 1 + ": 짱!!");
				}
			}
		});

		f.setVisible(true);
	}

}
