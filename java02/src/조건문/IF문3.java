package 조건문;

public class IF문3 {

	public static void main(String[] args) {
		// 조건이 여러개 일 때,
		int myNum = 99;

		if (myNum >= 80) {
			System.out.println("최우수");
		} else if (myNum >= 70) {
			System.out.println("우수");
		} else if (myNum >= 60) {
			System.out.println("보통");
		} else {
			System.out.println("미달");
		}

		int myTour = 10;

		if (myTour == 10) {
			System.out.println("VVIP");
		} else if (myTour == 6) {
			System.out.println("VIP");
		} else {
			System.out.println("Normal");
		}

		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;//switch문은 수동으로  break 써주어야함
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
			break;
		}

	}

}
