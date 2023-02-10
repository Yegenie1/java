package 복습;

public class 기본확인문제 {

	public static void main(String[] args) {
		String[] trip = {"베트남", "일본", "캐나다", "영국", "스위스"};
		for (int i = 0; i < trip.length; i++) {
			System.out.println(trip[i]);
		}
		
		char[] color = {'r', 'g', 'y', 'b', 'p'};
		for (char c : color) {
			System.out.println(c);
		}
		
		double[] h= {165.2, 159.5, 176.6, 185.4, 182.3};
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		
	}

}
