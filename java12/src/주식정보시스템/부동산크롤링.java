package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 부동산크롤링 {
	//크롤링은 인터넷 문서(html)를 다 받아와서,
	//html문서를 분석(parser,파싱!)해서 내가 원하는 정보를 추출하는 것

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://new.land.naver.com/complexes?ms=36.636149,127.491238,13&a=APT:ABYG:JGC&e=RETAIL");
		System.out.println("1.네트워크 연결 성공"+con);
		
		Document doc = null;//로컬변수 초기화

		try {
			doc = con.get(); 
			Elements list = doc.select(".lnb_item");//".menu span"이런거면 menu아래에 있는 span가져와라 이런거임
			System.out.println(list.size());
			
			for (int i = 0; i <list.size(); i++) {
				Element tag1 = list.get(i);
				System.out.println(tag1.text());
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//html코드를 다 가지고 와서 doc변수에 넣어놓음
		//System.out.println(doc);
	}

}
