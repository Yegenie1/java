package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name="홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();
		
		맨 m = new 맨();
		m.run();
		
		슈퍼맨 s = new 슈퍼맨();
		s.name="클라크";
		s.age=25000;
		s.power=99999;
		s.fly=true;
		System.out.println(s);
		s.eat();
		s.run();
		s.space();
		
		우먼 wm = new 우먼();
		wm.sleep();
		wm.hair();
		
		원더우먼 w = new 원더우먼();
		w.age=50000;
		w.gender='여';
		w.height=180;
		w.name="김말숙";
		w.weight=49;
		System.out.println(w);
		w.hair();
	}

}
