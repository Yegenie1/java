package 상속;

public class 원더우먼 extends 우먼{
	
	int weight;
	
	public void fight() {
		System.out.println("잘 싸운다~~~");
		
	}

	@Override
	public String toString() {
		return "원더우먼 [gender=" + gender + ", height=" + height + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
	
	

}
