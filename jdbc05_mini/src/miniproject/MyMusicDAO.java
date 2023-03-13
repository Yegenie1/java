package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;


public class MyMusicDAO { //CRUD

	//메서드를 만드는 것 ==> 메서드 정의(define)!
	//메서드를 정의했다고 실행되는 것은 아니다.!
	//메서드를 쓰는 것 ==> 메서드 호출(call)!
	public ArrayList<MyMusicVO> HEART_LIST() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		//ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MyMusicVO> list = new ArrayList<>();
		
		MyMusicVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "select * from hr.MY_HEARTLIST";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				//1. 검색겨로가가 있으면, 
				System.out.println("검색결과 있음. 성공.");
				//2. 각 컬럼에서 값들을 꺼내오자. 
				int music_id = rs.getInt(1); //id
				String user_id = rs.getString(2); //pw
				System.out.println(	music_id + " " 
									+ user_id);
				//검색결과를 검색화면 UI부분을 주어야 함.
				//3. 가방을 만들자.
				bag = new MyMusicVO();
				bag.setMusic_id(music_id);
				bag.setUser_id(user_id);

				
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
		
	}

	public ArrayList<MyMusicVO> BUY_LIST() {
		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		//ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<MyMusicVO> list = new ArrayList<>();
		
		MyMusicVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "Olacle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "select * from hr.MY_BUYLIST";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery(); //select문 전송시  
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next() 
				//true이면 있다라는 의미, false이면 없다라는 의미 
				//1. 검색겨로가가 있으면, 
				System.out.println("검색결과 있음. 성공.");
				//2. 각 컬럼에서 값들을 꺼내오자. 
				int music_id = rs.getInt(1); 
				String user_id = rs.getString(2); 
				System.out.println(	music_id + " " 
									+ user_id + " ");
				//검색결과를 검색화면 UI부분을 주어야 함.
				//3. 가방을 만들자.
				bag = new MyMusicVO();
				bag.setMusic_id(music_id);
				bag.setUser_id(user_id);

				
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
		
	}
}

