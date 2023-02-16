package 메서드연습;

public class 계산기사용2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result1 = cal2.add(300, 200);
		double result2 = cal2.add(300, 22.2);
		double result3 = cal2.add(11.1, 22.2);
		String result4 = cal2.add("나는 오늘 몇시에 ", 1);
		
		//double result44 = cal2.add(11, "시"); 순서바뀌면 안됨
		
		System.out.println(result1-100);
		System.out.println(result2-100);
		System.out.println(result3-100);
		System.out.println(result4);
		
		System.out.println(cal2.add(result1, result2));//이런것도 가능
		
		
	}

}
