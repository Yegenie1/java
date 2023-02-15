package 부품응용하기;

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

public class 로그인화면 {

	public static void main(String[] args) {
		// font,flowlayout
		// jframe,imageicon, imagelabel
		// idlable, pwlable, id입력값, pw입력값
		// 로그인버튼, reset버튼

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(350, 500);
		f.getContentPane().setBackground(Color.pink);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("돋음", 1, 20);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아  이  디   :");
		JLabel pw = new JLabel("비 밀 번 호  :");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		
		login.setBorder(null);//사진외 버튼 테두리를 지우는것
		reset.setBorder(null);
		login.setContentAreaFilled(false);//이미지가 버튼에 딱 맞게 하기
		reset.setContentAreaFilled(false);
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.pink);
		reset.setBackground(Color.pink);

		// 1)버튼에 액션기능을 add
		// 2)클릭했을 때, 어떤 부품이 처리를 담당할 지 new로 만들기
		// 3)클릭했을 때, 어떻게 처리할지
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백 넣기
				idText.setText("");
				pwText.setText("");

			}
		});

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// idText,pwText에 getText()
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				// root/1234인지 비교해서 로그인 성공실패 joptionpane으로 출력
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공!!");
					//일기장 쓰기 부품의 open()기능 쓰자
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();//메서드 사용==>메서드 호출!!
					f.setVisible(false);//현재화면 닫기
					
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패ㅜㅜ");
				}

			}
		});

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);

	}

}
