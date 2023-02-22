package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링sk하이닉스 {
	//크롤링은 인터넷 문서(html)를 다 받아와서,
	//html문서를 분석(parser,파싱!)해서 내가 원하는 정보를 추출하는 것

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=000660");
		System.out.println("1.네트워크 연결 성공"+con);
		
		Document doc = null;//로컬변수 초기화

		try {
			doc = con.get(); 

			Elements codeList = doc.select(".code");//elements~~Arraylist
			System.out.println(codeList.size());
			Element tag = codeList.get(0);
			System.out.println("sk 하이닉스 코드는 " + tag.text());
			
			//<span class="blind">
			Elements list = doc.select("span.blind");
			System.out.println(list.size());
			System.out.println(list);//가격이 blind로 되어있었음 13번째에 있었음
			Element tag2 = list.get(12);
			System.out.println("현재가 : " + tag2.text());
			Element tag3 = list.get(15);
			System.out.println("전일 : " + tag3.text());
			Element tag4 = list.get(19);
			System.out.println("시가 : " + tag4.text());
			Element tag5 = list.get(16);
			System.out.println("고가 : " + tag5.text());
			Element tag7 = list.get(17);
			System.out.println("상한가 : " + tag7.text());
			Element tag6 = list.get(20);
			System.out.println("저가: " + tag6.text());
			Element tag8 = list.get(21);
			System.out.println("하한가 : " + tag8.text());
			

			Elements downList = doc.select(".no_down");
			System.out.println(downList.size());
			System.out.println(downList);//가격이 blind로 되어있었음 13번째에 있었음
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//html코드를 다 가지고 와서 doc변수에 넣어놓음
		//System.out.println(doc);
	}

}
