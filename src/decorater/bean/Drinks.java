package decorater.bean;

public abstract class Drinks {
	private String description;
	private String name;
	
	public Drinks(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("这是一杯"+(description==null?"":("含有"+description+"的"))+name);
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
