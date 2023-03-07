package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class 반환값받아오기 {

	public static void main(String[] args) {
		//전화기 tel = new 전화기();
		//tel.인터넷하다();
		반환값연습 re = new 반환값연습();//메서드 12개
		re.add2();
		
		int result1 = re.add(200, 100); //int 300
		System.out.println("int + int = " + result1);
		
		double result2 = re.add(22.1,10);
		System.out.println("double+int = " + result2);
		
		String result3= re.add("나는", "천재야");
		System.out.println("String + String = " +result3);
		
		String result4 = re.add(100, "점");
		System.out.println("int + String = "+ result4);
		
		int[] result5 = re.add();//{1,2,3}
		result5[0] = 100;
		System.out.println(result5[0]);
		System.out.println(result5[1]);
		System.out.println(result5[2]);
		System.out.println("배열값 = " + result5[2]);
		
		Date result6 = re.getDate();
		System.out.println(result6);
		System.out.println(result6.getMinutes());
		System.out.println(result6.getSeconds());
		System.out.println(result6.getDay());//요일 일요일부터 0123456
		//==>리턴이 없는 값은 프린트 불가
		//==>getMinutes()는 리턴이 있어서 프린트 가능
		
		int result7 = re.getHour();
		System.out.println(result7 + "시 입니다");
		
		int result8 = re.getRandom2();
		System.out.println("랜덤한 정수는 " + result8);
		
		Random result8_1 = re.getRandom();
		System.out.println("랜덤 " + result8_1);
		
		ArrayList result9 = re.getList();
		System.out.println(result9.get(0)+" "+result9.get(1));
		result9.set(0, "양파");//0번 인덱스 값을 양파로 바꾸기
		System.out.println(result9);
		
		HashSet result10 = re.getSet();
		System.out.println(result10);
		
		System.out.println("전체 os 환경변수 값 : " + System.getenv());
		
	}

}
