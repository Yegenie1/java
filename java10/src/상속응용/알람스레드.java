package 상속응용;

import java.util.Date;

public class 알람스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 1000; i >0; i--) {
			Date date = new Date();
			System.out.println("시간 >>" + date);
			try {
				Thread.sleep(1000);//1초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		
		}
	}

}