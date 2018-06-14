package command.food;

public class Food {
	private String name;
	protected Food(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
