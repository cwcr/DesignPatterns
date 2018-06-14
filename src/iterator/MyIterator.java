package iterator;

import java.util.List;
import java.util.Iterator;

public class MyIterator<E> implements Iterator<E>,Iterable<E>{
	
	private List<E> list = null;
	private int currencyIndex = 0;
	public MyIterator(List<E> list) {
		this.list = list;
		currencyIndex = 0;
	}
	
	//Iterator 需要实现方法
	
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

	//Iterable 需要实现方法

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return this;
	}

}
