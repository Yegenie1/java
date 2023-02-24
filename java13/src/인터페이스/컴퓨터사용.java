package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		BananaComputer banana = new BananaComputer();
//		computerInterface com1 = new BananaComputer(); 가능 인터페이스가 더 크기 때문에
		
		apple.로고모양();
		apple.가격(153);
		apple.무게();
		banana.로고모양();
		banana.가격(265);
		banana.무게();
	}

}
