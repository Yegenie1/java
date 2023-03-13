package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;


public class loginDAO { //CRUD

	public int login(loginVO bag) {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select id, pw from hr.MUSICUSER where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				System.out.println("검색결과 있음. 성공.");
				
				if(bag.getId().equals(rs.getString(1))) {
					if(bag.getPw().equals(rs.getString(2))) {
						System.out.println("로그인 성공");
						result = 1;
					}
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				System.out.println("검색결과 없음. 성공.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
		
	}
	
	
}

