import java.util.Date;
public class Project  {
	private int id;
	private String name;
	private String type;
	//private Date startDate = new Date();
//	private Date endDate = new Date();
	//Project project = new Project();
	public static void main(String[] args) {
		addProject();
	}
	
	public static void addProject() {
		Tester tester = new Tester();
		tester.testing();
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void updateProject() {
		
	}
	public void deleteProject() {
		
	}
	

}
