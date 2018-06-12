package memo;

import java.io.Serializable;

public class Text implements Cloneable{
	private String content;
	
	private Operator operator;
	
	public Text(Operator operator) {
		this.operator = operator;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		save();
	}
	
	private void save() {
		operator.save(this.content);
	}
	
	public void undo() {
		this.content = operator.undo();
	}

	@Override
	public String toString() {
		return this.content;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
