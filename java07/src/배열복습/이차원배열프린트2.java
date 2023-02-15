package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"스키","서핑","보드"},
				{"눕기","자기","먹기"},
				{"코딩","공부","하기"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j]);
				System.out.print(" ");				
			}
			System.out.println();
		}
		
	}

}
