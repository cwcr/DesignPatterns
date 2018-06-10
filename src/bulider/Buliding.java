package bulider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Buliding {
	private List<String> list;
	
	public Buliding() {
		// TODO Auto-generated constructor stub
	}
	
	public Buliding(String bottom,String top){
		this();
		this.add(bottom);
		this.add(top);
	}
	
	public List<String> getList() {
		return list;
	}
	
	public Buliding setList(List<String> list) {
		this.list = list;
		return this;
	}
	
	@Override
	public String toString() {
		if(list!=null) {
			StringBuilder sBuilder = new StringBuilder();
			for (int i = list.size()-1; i >= 0 ; i--) {
				sBuilder.append(list.get(i));
				sBuilder.append("\n");
			}
			return sBuilder.toString();
		}
		return null;
	}
	
	public void add(String string) {
		if(list==null) {
			list = new ArrayList<>();
		}
		list.add(string);
	}
	
}
