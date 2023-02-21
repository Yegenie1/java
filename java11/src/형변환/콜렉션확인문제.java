package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 1.

		HashSet trip = new HashSet();
		trip.add("부산");
		trip.add("일본");
		trip.add("하노이");
		trip.add("싱가포르");
		trip.add("부산");
		trip.add("여수");

		System.out.println(trip);

		// 2.
		HashMap house = new HashMap();
		house.put("안방", "TV");
		house.put("거실", "쇼파");
		house.put("부엌", "냉장고");
		house.put("현관", "신발");

		System.out.println(house);
		System.out.println("현관에는 " + house.get("현관") + "이 있습니다.");
		house.replace("거실", "책상");
		System.out.println(house);

		// 3.
		LinkedList toDo = new LinkedList();

		toDo.add("코딩하기");
		toDo.add("빨래하기");
		toDo.add("정처기공부하기");
		toDo.add("설거지하기");
		toDo.add("책상청소하기");

		System.out.println(toDo);

		System.out.println(toDo.getFirst());
		System.out.println(toDo.getLast());

		System.out.println(toDo.set(1, "청소"));
		System.out.println(toDo);
		
		ArrayList toDo2 = new ArrayList();

		toDo2.add("자바코딩하기");
		toDo2.add("수업듣기");
		toDo2.add("정처기공부하기");
		toDo2.add("복습하기");
		toDo2.add("책상청소하기");

		System.out.println(toDo2);

		System.out.println(toDo2.get(0));
		System.out.println(toDo2.get(toDo2.size()-1));

		System.out.println(toDo2.set(1, "청소"));
		System.out.println(toDo2);
	}

}
