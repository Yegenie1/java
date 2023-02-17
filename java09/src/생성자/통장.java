package 생성자;

public class 통장 {
	
	String name; //이름
	String ssn; //주민번호
	int money; //돈
	

	//이름 , 주민번호, 돈을 입력해야 통장을 만들 수 있게 할 것이다!
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	//모든 멤버변수값을 다찍어주기 
	//자동완성은 source>>generate toString()
	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}
	
	
	
	
	

}
