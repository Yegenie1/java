package multi;

public class MusicVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜줌

	private int id;
	private String title;
	private String artist;
	private String content;
	private String img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "MusicVO [id=" + id + ", title=" + title + ", artist=" + artist + ", content=" + content + ", img=" + img
				+ "]";
	}
	
	
	
	
	
}
