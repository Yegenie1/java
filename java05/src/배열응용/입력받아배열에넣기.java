package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0;

		String[] last = new String[3];
		for (int i = 0; i < last.length; i++) {
			System.out.print("작년에 가고 싶었던 곳 세곳입력>> ");
			last[i] = sc.next();
		}

		String[] now = new String[3];
		for (int i = 0; i < now.length; i++) {
			System.out.print("올해 가고 싶었던 곳 세곳 입력>> ");
			now[i] = sc.next();
		}
		for (int i = 0; i < now.length; i++) {

			if (last[i].equals(now[i])) {
				count++;
			}
		}
	
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한곳은 " + count + "곳 입니다");

		sc.close();
	}

}
