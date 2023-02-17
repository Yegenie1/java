package 생성자;

public class Bbs사용 {

	public static void main(String[] args) {
		
		
		Bbs bbs1 = new Bbs(1, "자바", "생성자","홍길동");
		Bbs bbs2 = new Bbs(2, "jsp", "웹","김길동");
		Bbs bbs3 = new Bbs(3, "Spring", "실무","최길동");
		
		
		System.out.println("게시판");
		System.out.println("==============================");
		System.out.println("no\ttitle\tcontent\twriter\t");
		System.out.println(bbs1);
		System.out.println(bbs2);
		System.out.println(bbs3);
	}

}
