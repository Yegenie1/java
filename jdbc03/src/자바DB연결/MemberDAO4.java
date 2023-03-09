package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.MemberVO;

public class MemberDAO4 {// 테이블당 하나씩
	
public int login(MemberVO bag){
		
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ResultSet rs = ps.executeQuery(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				System.out.println("검색결과 있음. 성공.");
				result = 1;
		
			}
			ps.close();con.close();rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return  id, pw, name, tel 은 쓸 수 없음!!!!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
		// 검색결과가 있을 때는 bag에 데이터가 들어있음
		// 검색결과가 없을 떄는 bag에 null
		return result;
	
	}
	
	//메서드를 만드는 것 ==> 정의(define)
	public MemberVO one(String id){
		
		ResultSet rs = null;//항목명 + 결과 데이터를 담고있는 테이블
		//기본형 값으로 초기화
		//나머지 데이터형(String 참조형)은 주소가 들어가있음
		//참조형 변수를 초기화할 때는 null(주소가 없다는 의미)
		MemberVO bag = null;//밖으로빼기
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				System.out.println("검색결과 있음. 성공.");
				String id2 = rs.getString(1); //id
				String pw = rs.getString(2); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
				System.out.println(	id2 + " " 
									+ pw + " " 
									+ name + " " 
									+ tel);
				//검색결과를 검색화면 UI부분으로 주어야함
				//가방만들기
				bag = new MemberVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setPw(pw);
				bag.setTel(tel);
				
			}else {
				System.out.println("검색결과 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return  id, pw, name, tel 은 쓸 수 없음!!!!
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
		// 검색결과가 있을 때는 bag에 데이터가 들어있음
		// 검색결과가 없을 떄는 bag에 null
		return bag;
		
		
	}
	
	public int delete(String id) {
		int result =0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			//3. SQL문을 만든다.
			//ipaddress ==> InetAddress
			//자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야함.
			//PreparedStatement가 SQL부품!!
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setString(1, id);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println("회원삭제 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public int update(MemberVO bag) {
		
		int result =0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");
			
			//3. SQL문을 만든다.
			//ipaddress ==> InetAddress
			//자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야함.
			//PreparedStatement가 SQL부품!!
			String sql = "update hr.MEMBER set tel=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();//insert, update, delete문만 sql문 실행결과가 int
			if (result >= 1) {
				System.out.println("회원수정 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	// public void add(){요런거
	public int insert(MemberVO bag) {
		//1. 가방을 받아서 변수에 넣기
		int result=0;
		try {
			// 1.오라클11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java---oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			// 3. SQL문을 만든다.
			// ipaddress ==> InetAddress
			// 자바는 부품조립식이여서, string에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야함.
			// PreparedStatement가 SQL부품!!

			// (String id,String pw,String name,String tel)
			String sql = "insert into hr.MEMBER values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			// R이라는 언어 빼고 인덱스는 0부터 시작
			//유일하게 db는 인덱스가 1부터 시작
			//2.가방에서 값들을 하나씩 꺼내쓰세요
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			//==>insert into hr.member values ('a','a','a','a')
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("회원가입 성공!");
			}
			System.out.println(result);

		} catch (Exception e) {
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고, catch가 실행됨
			//result=0;
			//실행된 row수가 없으므로 result에 0이 들어감
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}
