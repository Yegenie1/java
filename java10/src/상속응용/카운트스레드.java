package 상속응용;

public class 카운트스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i >0; i--) {
			System.out.println("카운트 >>" + i);
			//cpu에게 스레드 쉬는시간 텀을 알려주자
			//thread를 잠깐 재울 수 있다
			//cpu가 외부자원(네트워크, 파일 , cpu...)
			//자바가 외부자원을 연결할 때는 위험하다는 경고
			//만약에 문제가 생기면 어떻게 할지 코드를 반드시 짜주어야 함
			try {
				Thread.sleep(2000);//2초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		
		}
	}

}
