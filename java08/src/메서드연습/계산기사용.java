package 메서드연습;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.더하기(2, 3); //호출
		cal.곱하기(30, 20, 10);
		int result = cal.빼기(500,200);
		System.out.println(result - 100);//결과값으로 다시 연산을 하고 싶을 때
	}

}
