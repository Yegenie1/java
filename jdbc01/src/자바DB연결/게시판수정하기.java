package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		
		//입력해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("no와 수정할 content순으로 입력하세요");
		int no = sc.nextInt();
		String content = sc.next();

		BbsDAO dao = new BbsDAO();
		dao.update(no, content);

	}

}
