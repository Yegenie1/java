package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		int count1 = 0;// 2학기성적이 더 높은 학생 카운트
		int count2 = 0;// 1,2학기 동일
		int sum1 = 0;
		int sum2 = 0;
		double avg1 = 0;
		double avg2 = 0;

		for (int i = 0; i < term2.length; i++) {

			sum1 += term1[i];
			sum2 += term2[i];
			if (term1[i] < term2[i]) {
				count1++;
			} else if (term1[i] == term2[i]) {
				count2++;
			}
			if (term2[i] == 100) {
				System.out.println("100점 받은 학생의 이름은 " + names[i] + "이고 번호는 " + i + "입니다.");
			}
			if (names[i] == "뉴진스") {
				System.out.println("뉴진스의 1학기 성적은 " + term1[i]);
				System.out.println("뉴진스의 2학기 성적은 " + term2[i]);
			}

		}
		System.out.println("2학기성적이 더 높은 학생수 : " + count1);
		System.out.println("1학기와 2학기 성적이 같은 학생수 : " + count2);

		avg1 = sum1 / term1.length;
		avg2 = sum2 / term2.length;
		if (avg1 > avg2) {
			System.out.println("1학기 성적 평균이 더 높습니다.");
		} else if (avg1 < avg2) {
			System.out.println("2학기 성적 평균이 더 높습니다.");
		} else {
			System.out.println("1학기 성적과 2학기 성적 평균이 더 높습니다.");
		}

	}

}
