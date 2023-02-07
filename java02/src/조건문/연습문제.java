package 조건문;

import java.util.Date;

public class 연습문제 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int year = date.getYear()+1900;
		if (year >=2000) {
			System.out.println("밀레니엄 세대이시군요!");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		
		int day = date.getDay();
		
		switch (day) {
		case 6: case 0://일요일0부터 시작!
			System.out.println("쉬자!!!!");
			break;
		case 1: case 2:case 3: case 4:case 5: 
			System.out.println("열심히 공부하자!!!");
			break;
		}
		
		int month = date.getMonth()+1;
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("30일까지");
			break;

		default:
			System.out.println("31일까지");
			break;
		}
	}

}
