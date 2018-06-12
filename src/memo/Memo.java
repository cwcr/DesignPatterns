package memo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

public class Memo {
	private final Integer bigSize = 5;
	private List<String> texts = new ArrayList<String>(bigSize) ;
	
	public void push(String text) {
		if(texts.size()<5) {
			texts.add(text);
		}
	}
	
	public String pop() {
		if(texts.size()<1) {
			return null;
		}else {
			String result = texts.get(texts.size()-1);
			texts.remove(texts.size()-1);
			return result;
		}
	}
}
