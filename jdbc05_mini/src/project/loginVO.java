package project;

public class loginVO {
	private String id;
	private String pw;
	private static String user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "loginVO [id=" + id + ", pw=" + pw + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;

	}

}
