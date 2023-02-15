package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		강아지 d1 = new 강아지();
		d1.name="하지";
		d1.birth=201213;
		System.out.println("이름 : " + d1.name);
		System.out.println("생일 : " + d1.birth);
		System.out.print("습관은 ");
		d1.habit();
		
		System.out.println();
		강아지 d2 = new 강아지();
		d2.name="루이";
		d2.birth=190513;
		System.out.println("이름 : " + d2.name);
		System.out.println("생일 : " + d2.birth);
		System.out.print("재주는 ");
		d2.talent();
	}

}
