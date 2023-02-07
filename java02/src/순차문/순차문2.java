package 순차문;

//import 부품이 있는 위치를 알려주는 역할 
import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 기본 순차문 ==>입력-->처리-->출력
		// 입력=> 부품 사용. 망치같은 언제나 바로 사용할 수 있는 것
		// 다이얼로그 같은 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식!!

		String data1 = JOptionPane.showInputDialog("정수를 입력하세요-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요-2");

		// 처리=> 숫자더하기 연산
		// String으로 int로 변경해주어야 함.
		int data11 = Integer.parseInt(data1);// "200"->200
		int data22 = Integer.parseInt(data2);
		
		double data33 =Double.parseDouble(data1);
		double data44 =Double.parseDouble(data2);
		int result = data11 + data22;// 결과도 int로 바꾸기
		double result2 = data33 + data44;// 결과도 int로 바꾸기
		// 출력=> 모니터 화면
		System.out.println(result);
		System.out.println(result2);

	}

}
