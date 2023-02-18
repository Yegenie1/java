package 상속응용;

public class 감소스레드 extends Thread{ //run() :동시에 실행될 내용을 run에 넣자.
	//동시에 실행할 내용을 run()메서드 안에 넣어주세요.
	@Override
	public void run() {
		for (int i = 100; i >50000; i--) {
			System.out.println("감소>> " + i);
		}
	}
}