package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		MyIterator<Integer> myIterator = new MyIterator<Integer>(list);
		while (myIterator.hasNext()) {
			System.err.println(myIterator.next());
		}
		
		System.err.println("--------------原有iterator方法-----------------");
		
		//list map set 等都支持Iterator化
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.err.println(iterator.next());
		}
	}
}
