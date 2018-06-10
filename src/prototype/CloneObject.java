package prototype;

import java.io.Serializable;

public class CloneObject implements Cloneable,Serializable{
	private Properties properties1;
	private Properties properties2;
	
	public CloneObject() {}
	
	public CloneObject(Integer i1,Integer i2) {
		this();
		this.properties1 = new Properties();
		this.properties1.setInteger(i1);
		this.properties2 = new Properties();
		this.properties2.setInteger(i2);
	}
	
	public Properties getProperties1() {
		return properties1;
	}
	public Properties getProperties2() {
		return properties2;
	}
	public void setProperties1(Properties properties1) {
		this.properties1 = properties1;
	}
	public void setProperties2(Properties properties2) {
		this.properties2 = properties2;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
