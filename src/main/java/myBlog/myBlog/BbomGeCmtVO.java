package myBlog.myBlog;

import java.sql.Date;

public class BbomGeCmtVO {
	
	private int num;
	private String userCode;
	private String articleCode;
	private String comments;
	private String registDate;
	
	public BbomGeCmtVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public BbomGeCmtVO(int num, String userCode, String articleCode, String comments, String registDate) {
		super();
		this.num = num;
		this.userCode = userCode;
		this.articleCode = articleCode;
		this.comments = comments;
		this.registDate = registDate;
	}



	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getArticleCode() {
		return articleCode;
	}

	public void setArticleCode(String articleCode) {
		this.articleCode = articleCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRegistDate() {
		return registDate;
	}

	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}
	
	

}
