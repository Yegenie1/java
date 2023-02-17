package 확인문제;

public class Truck extends Car{
	int 시속;
	boolean 짐;
	
	public void 소음있다() {
		System.out.println("소음이 심하다.");
		
	}
	
	@Override
	public void 타다() {
		System.out.println("아빠가 타고 있다.");
	}
}
