package composite.dto;

public abstract class Role {
	private String name;
	protected Role(String name) {
		this.name = name;
	}
	
	public void call() {
		System.out.println("Œ“ «"+name);
	}
}

