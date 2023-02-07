package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		String ssn = "2021102";

		// String은 기본형 데이터가 아니라서 명령어(함수)를 사용해야 함.
		if (ssn.equals("2021102")) {
			System.out.println("동일한 지역에서 태어나셨군요!");
		} else {
			System.out.println("동일한 지역에서 태어난게 아니시군요!");
		}

		char gender = ssn.charAt(0);// 첫번째 자리에 있는 문자 하나 추출

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;

		}

	}

}
