package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 500);

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);

		JLabel img = new JLabel();
		JLabel num1 = new JLabel();
		num1.setText("숫자1");
		JLabel num2 = new JLabel();
		num2.setText("숫자2");

		JButton b1 = new JButton();
		b1.setText("+");
		JButton b2 = new JButton();
		b2.setText("-");
		JButton b3 = new JButton();
		b3.setText("*");
		JButton b4 = new JButton();
		b4.setText("/");

		JTextField input1 = new JTextField(10);// 가로크기 10
		JTextField input2 = new JTextField(10);

		// img
		ImageIcon icon = new ImageIcon("011.jpg");
		img.setIcon(icon);

		Font font = new Font("돋음", 3, 30);
		num1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		num2.setFont(font);
		input2.setFont(font);

		b1.setBackground(Color.blue);
		b1.setForeground(Color.red);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.red);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.red);
		b4.setBackground(Color.blue);
		b4.setForeground(Color.red);

		input1.setBackground(Color.yellow);
		input2.setBackground(Color.yellow);

		f.add(img);
		f.add(num1);
		f.add(input1);
		f.add(num2);
		f.add(input2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 처리내용
				// input12글자 가져오기
				String s1 = input1.getText();
				String s2 = input2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 처리내용
				// input12글자 가져오기
				String s1 = input1.getText();
				String s2 = input2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 처리내용
				// input12글자 가져오기
				String s1 = input1.getText();
				String s2 = input2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을때 처리내용
				// input12글자 가져오기
				String s1 = input1.getText();
				String s2 = input2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = (double)n1 / n2;
				JOptionPane.showMessageDialog(f, String.format("%.2f",result));
			}
		});

		f.setVisible(true);
	}

}
