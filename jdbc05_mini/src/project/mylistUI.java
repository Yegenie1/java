package project;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class mylistUI {
	static String user;

	public void open() {
		String str = "";
		try {
			BufferedReader reader = new BufferedReader(new FileReader("./userID.txt"));

			try {
				str = reader.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String user = str;
		
		System.out.println(user);
		System.out.println("마이뮤직 오픈 됨 ");

		JFrame f = new JFrame();
		f.setTitle("MyMusic");
		f.setLayout(new FlowLayout());
		f.setSize(500, 600);

		JLabel l1 = new JLabel("좋아요한 리스트");
		JLabel l2 = new JLabel("구매한 리스트");

		JButton b1 = new JButton("MAIN");
		JButton b2 = new JButton("좋아요 관리");
		JButton b3 = new JButton("구매 목록 관리");
		JButton b4 = new JButton("등록 삭제 수정");
		JButton b5 = new JButton("MY MUSIC");

		Font font = new Font("돋움", Font.PLAIN, 30);
		Font font2 = new Font("돋움", Font.PLAIN, 20);

		l1.setFont(font);
		l2.setFont(font);

		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);

		b4.setFont(font);
		b5.setFont(font);

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MUSICMYlistgoodmanage중복 ui = new MUSICMYlistgoodmanage중복();
				ui.open();
				f.setVisible(false);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MUSICMYlistBUYmanage중복 ui = new MUSICMYlistBUYmanage중복();
				ui.open();
				f.setVisible(false);
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ManagemusicUI ui = new ManagemusicUI();
				ui.open();
				f.setVisible(false);
			}
		});

		MyMusicDAO dao = new MyMusicDAO();
		ArrayList<MyMusicVO> list = dao.HEART_LIST();

		String[] header = { "노래번호", "사용자 아이디" };
		String[][] all = new String[list.size()][2];
		HashSet<Object> set = new HashSet<Object>();
		int cheak = 0;
		if (list.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");

			for (int i = 0; i < all.length; i++) {
				if (list.get(i).getUser_id().equals(user)) {
					if (!set.add(list.get(i).getMusic_id() + "")) {

						System.out.println(
								"중복 발견 ID : " + list.get(i).getMusic_id() + " | USER : " + list.get(i).getUser_id());
						cheak = 1;

					}

					if (cheak == 0) {
						all[i][0] = list.get(i).getMusic_id() + "";
						all[i][1] = list.get(i).getUser_id();
					}
					cheak = 0;
				}
			}
		} // else

		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(450, 150));

		ArrayList<MyMusicVO> list2 = dao.BUY_LIST();

		Object[][] all2 = new String[list2.size()][3];
		HashSet<Object> set2 = new HashSet<Object>();

		if (list2.size() == 0) {
			System.out.println("검색결과 없음. ");
		} else {
			System.out.println("검색결과는 전체 " + list2.size() + "개 입니다.");
			for (int i = 0; i < all2.length; i++) {
				if (list2.get(i).getUser_id().equals(user)) {
					if (!set2.add(list2.get(i).getMusic_id() + "")) {
						{
							System.out.println("중복 발견 ID : " + list.get(i).getMusic_id() + " | USER : "
									+ list.get(i).getUser_id());
							cheak = 1;
						}
					}
					if (cheak == 0) {
						all2[i][0] = list2.get(i).getMusic_id() + "";
						all2[i][1] = list2.get(i).getUser_id();
					}
					cheak = 0;
				}
			}
		} // else

		JTable table2 = new JTable(all2, header);
		JScrollPane scroll2 = new JScrollPane(table2);
		scroll2.setPreferredSize(new Dimension(450, 150));

		f.add(b4);
		f.add(b5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(scroll);
		f.add(l2);
		f.add(scroll2);

		f.setVisible(true);
	}

}
