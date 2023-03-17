package multi;

public class ProductVO {
	//MemberVO가방에 넣은 데이터는 Member테이블에 들어갈 예정
	// 각 컬럼과 일치시켜줌
	private String id;
	private String name;
	private String content;
	private int price;
	private String company;
	private String img;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + ", company="
				+ company + ", img=" + img + "]";
	}
	
	
	
	
}
