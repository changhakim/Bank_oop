package domain;

public class ArticleBean {
	
	private String seq,title, content, writer, redDate;//제목 내용 쓴사람 글시간
	public String getSeq() {
		return seq; // 1000부터 1씩증가
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRedDate() {
		return redDate;
	}
	public void setRedDate(String redDate) {
		this.redDate = redDate;
	}
	@Override
	public String toString() {
		return "ArticleBean [seq=" + seq + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", redDate=" + redDate + "]";
	}


}
