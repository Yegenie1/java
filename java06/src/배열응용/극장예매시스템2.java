package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {
	static String noList = "";

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("극장예매 시스템2");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.white);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("궁서", 1, 30);
		Font font2 = new Font("바탕", 1, 20);
		Font font3 = new Font("돋음", 1, 20);

		JLabel screen = new JLabel("Screen");
		screen.setBounds(400, 0, 800, 100);
		screen.setFont(font1);
		screen.setForeground(Color.black);

		JButton[] btn = new JButton[100];


		f.add(screen);
		

		JLabel result = new JLabel();
		result.setForeground(Color.magenta);

		JLabel result3 = new JLabel();
		
		int seat[] = new int[btn.length];

		for (int i = 0; i < seat.length; i++) {
			btn[i] = new JButton("" + i);
			btn[i].setFont(font2);
			f.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					// System.out.println(text);
					int no = Integer.parseInt(text);
					// 이미 1인지 확인하고 1이 아니면 예약가능
					if (seat[no] == 1) {
						result.setText(text + "번 예약불가");
						result.setForeground(Color.red);

					} else {
						seat[no] = 1;// 예약좌석은 1!!
						result.setText(text + "번 예약완료!");
						result.setForeground(Color.blue);
						btn[no].setBackground(Color.DARK_GRAY);
						noList=noList + no + "번 ";
						result3.setText(noList);
						
						// btn[no].setEnabled(false);
					}
				}
			});
		}

		f.add(result);

		JButton total = new JButton("결제하기");
		total.setBackground(Color.LIGHT_GRAY);
		total.setForeground(Color.black);
		total.setFont(font3);

		f.add(total);

		JLabel result2 = new JLabel();

		JLabel text2 = new JLabel("예매된 좌석 : ");
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int count = 0;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;

					}
					
				}
				result2.setText(count + "개의 좌석이 예매되었습니다.");
				JOptionPane.showMessageDialog(f, (count * 10000) + "원 결제하세요");
			}
		});
		
		text2.setFont(font2);
		result2.setFont(font2);
		result3.setFont(font2);

		f.add(text2);
		f.add(result3);
		f.add(result2);
		
		
		f.setVisible(true);

	}

}
