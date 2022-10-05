package step5;

public class Engineer {

	private String name;
	private Notebook notebook;
	
	//持失切
	public Engineer(String name, Notebook notebook) {
		super();
		this.name = name;
		this.notebook = notebook;
	}
	
	//SETGET 五社球
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Notebook getNotebook() {
		return notebook;
	}
	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}
	
	
}
