package 주식정보시스템;

import java.awt.BufferCapabilities.FlipContents;
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
	//크롤링은 인터넷 문서(html)를 다 받아와서,
	//html문서를 분석(parser,파싱!)해서 내가 원하는 정보를 추출하는 것

	public void naver(String code2) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code="+code2);
		//System.out.println("1.네트워크 연결 성공"+con);
		
		Document doc = null;//로컬변수 초기화

		try {
			doc = con.get(); 
			
			Elements codeList = doc.select(".code");//elements~~Arraylist
			//System.out.println(codeList.size());
			Element tag = codeList.get(0);
			System.out.println("코드는 " + tag.text());
			
			//<span class="blind">
			Elements list = doc.select("span.blind");
			//System.out.println(list.size());
			
			//System.out.println(list);//가격이 blind로 되어있었음 13번째에 있었음
			//System.out.println(list.get(12));
			Element tag2 = list.get(12);
			Element tag3 = list.get(16);
			Element tag4 = list.get(20);
			String today = tag2.text();
			String low = tag4.text();
			String high = tag3.text();
			System.out.println("현재가는 "+today);
			System.out.println("최저가는 "+low);
			System.out.println("최고가는 "+high);
			
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write(code2+"\n");
			file.write(today+"\n");
			file.write(low+"\n");
			file.write(high+"\n");
			file.close();

					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//html코드를 다 가지고 와서 doc변수에 넣어놓음
		//System.out.println(doc);
	}

}
