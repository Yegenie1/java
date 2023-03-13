package miniproject;

//RAM에 만드는 저장공간을 만든다.
public class MyMusicVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	//각 컬럼과 일치시켜 줌. 
	private int music_id;
	private String user_id;

	public int getMusic_id() {
		return music_id;
	}
	public void setMusic_id(int music_id) {
		this.music_id = music_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	
	//가방에 어떤 값들이 들어있는지 string으로 다 찍어볼 수 있다.
	
}
