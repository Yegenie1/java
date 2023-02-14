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

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.orange);
		// 배치해주는 부품 - FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);// 추가한 순서대로 f에 붙는다.

		// 버튼 배열 많이 만들어서 집어넣을 배열 생성
		JButton[] btn = new JButton[100];

		Font font = new Font("궁서", Font.BOLD, 30);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.blue);
		result.setFont(font);

		// 예약여부를 저장하는 배열을 만들어주자
		int[] seat = new int[btn.length]; // {0,0,0,0,0,0,0,0,0,0}
		// 각자리에 저장된 값이 0이면 예약x 예약되면 1

		// 반복해서 배열에 버튼 만들기
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);// 반복애서 f에 add				

			// 버튼에 액션기능 add
			// 1)액션기능 추가
			// 2) 클릭했을 때 어떤 부품이 담당할지 부품생성
			// 3) 클릭했을 때 어떻게 처리할지 코딩
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 일어날 일
					// e.getActionCommand(); : 클릭한 버튼의 글자를 가지고와줌
					String text = e.getActionCommand();
					System.out.println(text);
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
						btn[no].setEnabled(false);
					}
					
					

				}
				
				
			});

			

		}

		f.add(result);

		JButton total = new JButton("전체 예약내역");
		total.setBackground(Color.LIGHT_GRAY);
		total.setForeground(Color.white);
		total.setFont(font);

		f.add(total);

		JLabel result2 = new JLabel();

		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때, 내용넣기
				// 배열안에 저장된 수 몇개가 1인지 체크해서 카운트
				// 영화예배비 1장당 1만원 결제금액 출력
				int cnt = 0;
				for (int j = 0; j < seat.length; j++) {
					if (seat[j] == 1) {
						cnt++;
					}
				}
				result2.setText(cnt + "개의 좌석이 예매되었습니다.");
				JOptionPane.showMessageDialog(f, (cnt * 10000) + "원 결제하세요");
			}
		});
		f.add(result2);

		f.setVisible(true);
	}

}
