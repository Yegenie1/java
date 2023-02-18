package 상속응용;

public class 내스레드사용 {
	public static void main(String[] args) {
		알람스레드 time = new 알람스레드();
		알람울리기스레드 timer = new 알람울리기스레드();
		
		time.start();
		timer.start();
		
	}
	
	

}
