package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,500);
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());//한번만 쓸거면 이렇게 써도 됨
		
		f.add(new JButton("나는 버튼"));//component <= JButton(자동형변환)
		f.add(new JLabel("나는 라벨"));
		f.add(new JTextField(10));
		
		
		f.setVisible(true);
		

	}

}
