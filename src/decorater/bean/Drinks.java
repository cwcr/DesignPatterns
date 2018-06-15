package decorater.bean;

public abstract class Drinks {
	private String description;
	private String name;
	
	public Drinks(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("����һ��"+(description==null?"":("����"+description+"��"))+name);
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
