package 상속기본;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar fly = new FlyCar();
		
		fly.color="하얀색";
		fly.fly=true;
		fly.run();
		fly.fly();
		
		System.out.println(fly.color);
		System.out.println(fly.fly);

	}

}
