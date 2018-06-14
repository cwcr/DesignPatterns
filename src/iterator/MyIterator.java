package iterator;

import java.util.List;
import java.util.Iterator;

public class MyIterator<E> implements Iterator<E>{
	
	private List<E> list = null;
	private int currencyIndex = 0;
	public MyIterator(List<E> list) {
		this.list = list;
		currencyIndex = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		if(currencyIndex < this.list.size()) {
			return true;
		}
		return false;
	}

	@Override
	public E next() {
		if(hasNext()) {
			currencyIndex ++ ;
			return list.get(currencyIndex-1);
		}
		return null;
	}

}
