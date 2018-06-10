package prototype;

import java.io.Serializable;

public class Properties implements Serializable{
	private Integer integer;
	public Integer getInteger() {
		return integer;
	}
	public Properties setInteger(Integer integer) {
		this.integer = integer;
		return this;
	}
	@Override
	public String toString() {
		if(integer==null) {
			return "Nothing";
		}
		else {
			return integer.toString();
		}
	}
}
