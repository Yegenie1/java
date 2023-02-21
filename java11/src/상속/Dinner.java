package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dinner extends JFrame {

	public static void main(String[] args) {
		new Dinner();

	}

	public Dinner() {
		setTitle("저녁밥먹기");
		setSize(800, 800);
		setLayout(null);
		MyThread d1 = new MyThread("a.jpg", 100, 0);
		MyThread d2 = new MyThread("b.jpg", 100, 150);
		MyThread d3 = new MyThread("c.jpg", 100, 300);
		MyThread d4 = new MyThread("d.jpg", 100, 450);
		MyThread d5 = new MyThread("e.jpg", 100, 600);

		d1.start();
		d2.start();
		d3.start();
		d4.start();
		d5.start();
		setVisible(true);

	}

	public class MyThread extends Thread {

		int x, y;
		JLabel label;// 전역변수로 선언

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 150);// jframe에 붙은 위치 지정
			add(label);

		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용
			// 모든 스레드가 오른쪽으로 움직이고 싶음
			// 화면에서 오른쪽으로 움직이는 것은 x를 늘려주는 것
			boolean flag = false;

			Random r = new Random();
			for (int i = 0; i < 100; i++) {
				int move = r.nextInt(50);
				if (x <= 700 && flag == false) {
					x = x + move;
				} else {
					flag = true;
					x = x - move;
					if (x <= 0) {
						break;
					}

				}

				System.out.println(x + "-----" + y);
				label.setBounds(x, y, 150, 150);// 다시 위치 지정
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
