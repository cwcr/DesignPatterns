package single;

public class HungrySingle {
	private static HungrySingle one = null;
	static {
		one = new HungrySingle();
	}
	//private static HungrySingle one = new HungrySingle();
	
	private HungrySingle() {}
	
	public static HungrySingle newInstance() {
		return one;
	}
	
}
