package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	
	static int count;
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(350,350);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel num = new JLabel("0");
		Font font1 = new Font("궁서",1,150);
		
		num.setFont(font1);
		num.setForeground(Color.black);
		
		JButton plus = new JButton("1더하기");
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count++;
				if (count>=0) {
					num.setForeground(Color.blue);
				}else if (count<0){
					num.setForeground(Color.red);
				}else {
					num.setForeground(Color.black);
				}
				num.setText(count + "");
			}
		});
		JButton reset = new JButton("0으로 리셋");
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count=0;
				num.setForeground(Color.black);
				num.setText(count + "");
			}
		});
		JButton minus = new JButton("1빼기");
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				count--;
				if (count>0) {
					num.setForeground(Color.blue);
				}else if (count<0){
					num.setForeground(Color.red);
				}else {
					num.setForeground(Color.black);

				}
				num.setText(count + "");
			}
		});
		plus.setBackground(Color.DARK_GRAY);
		reset.setBackground(Color.orange);
		minus.setBackground(Color.DARK_GRAY);
		plus.setForeground(Color.white);
		reset.setForeground(Color.red);
		minus.setForeground(Color.white);
		
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(num);

		
		
		
		
		f.setVisible(true);
		
		
		
	}

}
