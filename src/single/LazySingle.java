package single;
/**
 * ÀÁººµ¥ÀýÄ£Ê½
 * @author ye
 *
 */
public class LazySingle {
	private static LazySingle one = null;
	
	private LazySingle() {}
	
	public static LazySingle newInstance() {
		if(one == null) {
			synchronized (LazySingle.class) {
				if(one == null) {
					one = new LazySingle();
				}
			}
		}
		
		return one;
	}
	
}
