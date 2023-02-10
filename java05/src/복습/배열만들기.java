package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열만들기 - 이미 값을 알고 있는 경우
		String[] hobby = { "run", "book", "swim", "walk" };
		// hobby : 참조형 변수 , 주소가 들어있음
		System.out.println(hobby);
		System.out.println("0: " + hobby[0]);
		System.out.println("1: " + hobby[1]);
		System.out.println("2: " + hobby[2]);
		System.out.println("3: " + hobby[3]);
		System.out.println(hobby.length);
		System.out.println(hobby[hobby.length - 1]);
		// c타입의 for문
		for (int i = 0; i < hobby.length; i++) {
			// i의 역할 = index역할
			System.out.println(i + ": " + hobby[i]);
		}

		// for-each문 : 알아서 처음부터 인덱스를 하나씩 증가하면서 하나씩 꺼내온다
		//{"run", "book", "swim", "walk"}
		for (String x : hobby) {
			System.out.println(x);//i처럼 인덱스를 가져올순 없음 단순출력용 읽기전용

		}

		// 2.배열만들기 - 값을 모르고 있는 경우, 공간부터 만들어두자
		String[] job = new String[5];
		System.out.println(job);
		job[0] = "백앤드 프로그래머";
		job[1] = "바리스타";
		System.out.println(job[0]);
		System.out.println(job[1]);
		// System.out.println(job[5]); 애러남
		System.out.println(job[4]);
		System.out.println(job[job.length - 1]);
		for (int i = 0; i < job.length; i++) {
			System.out.println(i + ": " + job[i]);
		}
		
		for (String x : job) {
			System.out.println(x);
		}

	}
}
