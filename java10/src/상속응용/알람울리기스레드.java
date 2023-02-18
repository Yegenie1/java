package 상속응용;


public class 알람울리기스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <1000; i++) {
			System.out.println(i*10 +"초 지남!!!!!");
			try {
				Thread.sleep(10000);//1초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		
		}
	}

}
