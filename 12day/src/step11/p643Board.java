package step11;

public class p643Board {
	private String subject;
	private String content;
	private String writer;
	//»ý¼ºÀÚ
	public p643Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	//SETGET
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	@Override
	public String toString() {
		return "p643Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}

	
}
