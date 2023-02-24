package 인터페이스;

public class BananaComputer implements computerInterface {

	@Override
	public void 로고모양() {
		System.out.println("바나나입니다.");

	}

	@Override
	public void 가격(int x) {
		System.out.println("가격은 " + x + "만원");

	}

	@Override
	public void 무게() {
		System.out.println("사과 컴퓨터보다 가볍습니다.");

	}

}
