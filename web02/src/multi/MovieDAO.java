package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MovieDAO {// 테이블당 하나씩

	// 메서드를 만드는 것 ==> 정의(define)

	public int delete(String id) {
		int result = 0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql 연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!
			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setString(1, id);

			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println("회원삭제 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	public int update(MemberVO bag) {

		int result = 0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql 연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!
			String sql = "update member set tel=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();// insert, update, delete문만 sql문 실행결과가 int
			if (result >= 1) {
				System.out.println("회원수정 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	// public void add(){요런거
	public int insert(MovieVO bag) {
		// 1. 가방을 받아서 변수에 넣기
		int result = 0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:mysql://localhost:3306/multi";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mysql연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!

			// (String id,String pw,String name,String tel)
			String sql = "insert into movie values(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			// R이라는 언어 빼고 인덱스는 0부터 시작
			// 유일하게 db는 인덱스가 1부터 시작
			// 2.가방에서 값들을 하나씩 꺼내쓰세요
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getLocation());
			ps.setString(5, bag.getDirector());
			// ==>insert into hr.member values ('a','a','a','a')
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("영화등록 성공!");
			}
			System.out.println(result);

		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고, catch가 실행됨
			// result=0;
			// 실행된 row수가 없으므로 result에 0이 들어감
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
