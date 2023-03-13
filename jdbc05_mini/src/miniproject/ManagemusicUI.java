package miniproject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class ManagemusicUI {

	public void open() {
		JFrame f = new JFrame();
		f.setTitle("음원관리화면");
		f.setSize(480, 800);
		FlowLayout flow = new FlowLayout();
		
		JLabel l1 = new JLabel("     음   원   관    리      ");
		JLabel l2 = new JLabel("노래ID");
		JLabel l3 = new JLabel("제목");
		JLabel l4 = new JLabel("가수");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		
		JButton b1 = new JButton("INSERT");
		JButton b2 = new JButton("DELETE");
		JButton b3 = new JButton("UPDATE");
		JButton b4 = new JButton("음원관리");
		JButton b5 = new JButton("mymusic");
		JButton b6 = new JButton("SELECT");
		Font font = new Font("궁서", Font.BOLD, 40);
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("INSERT");
				int id = Integer.parseInt(t1.getText());			
				String title = t2.getText();
				String artist = t3.getText();
				ManagemusicVO bag=new ManagemusicVO();
				bag.setId(id);
				bag.setTitle(title);
				bag.setTitle(artist);
				ManagemusicDAO dao = new ManagemusicDAO();
				int result=dao.insert(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "음원등록 성공");
				}else {
					JOptionPane.showMessageDialog(f, "음원등록 실패, 재입력해주세요.");
				}
			}//action
		}); 
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("DELETE");
				int id = Integer.parseInt(t1.getText());			
				String title = t2.getText();
				String artist = t3.getText();
				ManagemusicVO bag=new ManagemusicVO();
				bag.setId(id);
				bag.setTitle(title);
				bag.setTitle(artist);
				ManagemusicDAO dao = new ManagemusicDAO();
				int result=dao.delete(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "음원삭제 성공");
				}else {
					JOptionPane.showMessageDialog(f, "음원삭제 실패, 재입력해주세요.");
				}
			}//action
		}); 
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("UPDATE");
				int id = Integer.parseInt(t1.getText());			
				String title = t2.getText();
				String artist = t3.getText();
				ManagemusicVO bag=new ManagemusicVO();
				bag.setId(id);
				bag.setTitle(title);
				bag.setTitle(artist);
				ManagemusicDAO dao = new ManagemusicDAO();
				int result=dao.update(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "음원수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "음원수정 실패, 재입력해주세요.");
				}
			}//action
		}); 
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mylistUI mylist = new mylistUI();
				mylist.open();
				f.setVisible(false);
			}
		});
		
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("SELECT");
				int id = Integer.parseInt(t1.getText());			
				ManagemusicDAO dao = new ManagemusicDAO();
				ManagemusicVO bag=dao.one(id);
				t2.setText(bag.getTitle());
				t3.setText(bag.getArtist());
				t2.setBackground(Color.pink);
				t3.setBackground(Color.pink);
			}
			});//action
		
		//폰트를 설정하기 위해 font부품 필요 
		
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		///조립을 시작해보자. ///
		f.setLayout(flow);
		
		f.add(b4);f.add(b5);f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(b1); f.add(b2);f.add(b3);f.add(b6);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b6.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.black);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.black);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.black);
		
		b1.setBackground(Color.pink); //배경색
		b1.setForeground(Color.blue); //글자색 
		b2.setBackground(Color.pink);
		b2.setForeground(Color.blue);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.blue);
		b6.setBackground(Color.pink);
		b6.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.green);
		//맨 끝으로~~~~~
		f.setVisible(true);

	}

}