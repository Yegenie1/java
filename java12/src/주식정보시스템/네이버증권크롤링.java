package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {
	//크롤링은 인터넷 문서(html)를 다 받아와서,
	//html문서를 분석(parser,파싱!)해서 내가 원하는 정보를 추출하는 것

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1.네트워크 연결 성공"+con);
		
		Document doc = null;//로컬변수 초기화

		try {
			doc = con.get(); 
			Elements codeList = doc.select(".code");//".menu span"이런거면 menu아래에 있는 span가져와라 이런거임
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			System.out.println("코드는 " + tag.text());
			
			Elements textList = doc.select(".sptxt.sp_txt9");//".menu span"이런거면 menu아래에 있는 span가져와라 이런거임
			System.out.println(textList.size());
			Element tag1 = textList.get(0);
			System.out.println("text1은 " + tag1.text());
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//html코드를 다 가지고 와서 doc변수에 넣어놓음
		//System.out.println(doc);
	}

}
