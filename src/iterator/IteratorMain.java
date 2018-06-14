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
		
		System.err.println("--------------可以看出来增强for循环是通过迭代器实现的-----------------");
		for(Integer i:myIterator) {
			System.err.println(i);
		}
		
		System.err.println("--------------继承Iterator的对象可以使用增强for循环-----------------");
		MyIterator<Integer> myIterator2 = new MyIterator<Integer>(list);
		for(Integer i:myIterator2) {
			System.err.println(i);
		}
		
		System.err.println("--------------原有iterator方法-----------------");
		
		//list map set 等都支持Iterator化
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.err.println(iterator.next());
		}
	}
}
