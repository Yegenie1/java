package 메서드연습;

public class 계산기사용3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 6900;
		int count1 = 5; //오전에 온 손님 수
		int count2 = 4; //오전에 온 손님 수
		
		int sum = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 "+sum+"입니다.");
		
		int minus = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " +Math.abs(minus)+"입니다.");
		System.out.println(Math.ceil(3.333));
		System.out.println(Math.floor(3.333));
		System.out.println(Math.round(3.333));
		System.out.println(Math.ceil(3.333));
		System.out.println(Math.sqrt(100));//루트
		System.out.println(Math.max(100, 200));
		System.out.println(Math.min(100, 200));
		System.out.println(Math.pow(2, 3));//제곱	
		
		
		int total1 = cal3.mul(count1, price);
		System.out.println("오전 결제 금액은 " + total1 +"원 입니다.");
		
		int total2 = cal3.mul(count2, price);
	
		System.out.println("오후 결제 금액은 " + total2 +"원 입니다.");
		
		int totalPrice = cal3.add(total1, total2);
		System.out.println("오늘 하루 총 결제 금액은 " + totalPrice +"원 입니다.");
		
		int per1 = cal3.div(totalPrice, sum);
		System.out.println("1인당 결제금액은 " + per1 +"원 입니다.");
		
	}

}
