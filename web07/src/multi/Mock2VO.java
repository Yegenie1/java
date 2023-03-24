package multi;

public class Mock2VO {
	private String id;
	private String title;
	private String artist;
	private String content;
	private String img;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
		return "Mock2VO [id=" + id + ", title=" + title + ", artist=" + artist + ", content=" + content + ", img=" + img
				+ "]";
	}
	
	

	
}
