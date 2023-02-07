package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리적으로 판단하고 싶은데, 조건이 2개 이상이여서 
		//어떻게 판단해야 할지 모를때
		int id = 1111;
		int id2 = 2222;

		int pw = 3333;
		int pw2 = 3333;

		// 아이디가 동일한지 비교
		// 패스워드가 동일한지 비교 두 조건이 모두 맞아야 맞다고 판단

		System.out.println(id == id2);
		System.out.println(pw == pw2);
		System.out.println(id == id2 && pw == pw2);
		
		int mem1 = 111;
		int mem2 = 222;
		//||,or조건 조건 중에 하나만 맞으면 맞다고 판다
		
		System.out.println(mem1 ==111 || mem2 ==222);
		
		
		//1.기본 데이터 4가지 + String
		//==> 정수, 실수, 문자, 논리 + String
		//2. 연산자: 산술 + 비교 + 논리(and, or, not)
		//==> 산술 : +-/*% , 비교 : == =! > >= , 논리 && ||
		//3. 정수형 변수를 만들고 싶을 때 사용하는 타입은?
		//int 변수명 = 초기값;
		//4. 실수형 변수를 만들고 싶을 때 사용하는 타입은?
		//double 변수명 = 초기값;
		//5. 변수를 만드는 방법??
		//int num =0; =>데이터 타입 변수명 = 초기값;
	}

}
