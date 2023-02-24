package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
//		type name = new type();
		//인터페이스는 불완젆기 때문에 이것을 틀로해서 객체생성 불가능
		//익명클래스                                          v여기에서부터 익명클래스 이름없는 클래스를 가지고 객체생성
		computerInterface com = new computerInterface() {
			
			@Override
			public void 무게() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 로고모양() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 가격(int x) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
