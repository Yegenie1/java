package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;
import 화면DB연결.MemberVO;

public class BbsDAO {// 테이블당 하나씩==>cud완성하기
	
	public BbsVO one(int no) {
		
		ResultSet rs = null;
		
		BbsVO bag = null;
		
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
			String sql = "select * from hr.BBS where no = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setInt(1, no);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			rs=ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				System.out.println("검색결과 있음. 성공.");
				int NO = rs.getInt(1); //id
				String title = rs.getString(2); //pw
				String content = rs.getString(3); //name
				String writer = rs.getString(4); //tel
				System.out.println(	NO + " " 
									+ title + " " 
									+ content + " " 
									+ writer);
				//검색결과를 검색화면 UI부분으로 주어야함
				//가방만들기
				bag = new BbsVO();
				bag.setNo(NO);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				
			}else {
				System.out.println("검색결과 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
	}
	
	
	
	public int delete(int no) {
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
			String sql = "delete from hr.BBS where NO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setInt(1, no);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println("게시물 삭제 성공");
			}
			
			System.out.println("4. SQL문 오라클로 보내기 성공");
			//System.out.println(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}
	
	public int update(BbsVO bag) {
		int result = 0;
		
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
			String sql = "update hr.BBS set content=? where NO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			//con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			result = ps.executeUpdate();//insert, update, delete문만 sql문 실행결과가 int
			if (result >= 1) {
				System.out.println("게시물수정 성공");
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
	public int insert(BbsVO bag) {
		int result = 0;
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
			String sql = "insert into hr.BBS values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			// con부품으로 sql스트링에 있는 SQL부품으로 만들어주세요
			// R이라는 언어 빼고 인덱스는 0부터 시작
			//유일하게 db는 인덱스가 1부터 시작
			ps.setInt(1, bag.getNo());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			//==>insert into hr.member values ('a','a','a','a')
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			if (result >= 1) {
				System.out.println("게시물 추가 성공");
			}
			System.out.println("4. SQL문 오라클로 보내기 성공");
			// System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;

	}




}
