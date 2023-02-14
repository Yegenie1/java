package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		//1.프레임만들기
		JFrame f = new JFrame();
		//2.프레임설정
		f.setSize(800, 800);
		//레이아웃 부품설정하지 않음
		f.setLayout(null);
		//3.버튼을 넣을 배열 만들기
		JButton[] btn = new JButton[500];
		//컬러배열
		Color[] colors = {Color.black, Color.pink,Color.white,Color.magenta, Color.LIGHT_GRAY,Color.green ,Color.DARK_GRAY,Color.cyan,Color.blue};
		
		Random r = new Random(42);
		//4.버튼을 만들어서 배열에 넣기
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton("btn"+i);
		}
		//colors[r.nextInt(colors.length)]
		for (int i = 0; i < btn.length; i++) {
			int x = r.nextInt(900);
			int y = r.nextInt(700);
			btn[i].setBounds(x, y, 100, 50);
			btn[i].setBackground(colors[r.nextInt(9)]);
			f.add(btn[i]);
		}
		f.getContentPane().setBackground(Color.orange);
		
		f.setVisible(true);
		
		
	}

}
