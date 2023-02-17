package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8 ,"삼성역");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day2 = new Day("산책", 4,"삼성역");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3 = new Day("시험정리", 5 ,"카페");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		//총 12개 다이나믹 생성,멤버변수==> 객체 생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴변수
		//인스턴스변수라고 부른다
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

	}

}
