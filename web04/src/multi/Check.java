package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/check.do")

public class Check extends HttpServlet {
	
	//생명주기
	
	@Override
	public void init() throws ServletException {
		System.out.println("check 서블릿 객체가 하나 만들어진다");
	}
	
	@Override
	public void destroy() {
		System.out.println("check서블릿 소멸됨");
	}
	
	//get요청, 클라이언트로부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String today = request.getParameter("today");
		String result = "그냥 있자";
		if (today.equals("맑음")) {
			result ="나가자!!";
		}else if (today.equals("흐림")) {
			result ="집에서 코딩하자";
		}else if (today.equals("비옴")) {
			result ="쇼핑하러가자";
		}
		//setcontenttype은 out만들기 전에 설정
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다.<img src='no.png'>";
		if (pass.equals("나는 왕이다.")) {
			result ="들어오세요<img src='ok.jpg'>";
		}
		//setcontenttype은 out만들기 전에 설정
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
		
	
	}

}
