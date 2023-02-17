package 상속;

public class 우먼 extends 사람{
	
	char gender;
	int height;
	
	public void hair() {
		System.out.println("머리가 길다.");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("미녀는 잠꾸러기");
	}
	
	

}
