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
		
		System.err.println("--------------���Կ�������ǿforѭ����ͨ��������ʵ�ֵ�-----------------");
		for(Integer i:myIterator) {
			System.err.println(i);
		}
		
		System.err.println("--------------�̳�Iterator�Ķ������ʹ����ǿforѭ��-----------------");
		MyIterator<Integer> myIterator2 = new MyIterator<Integer>(list);
		for(Integer i:myIterator2) {
			System.err.println(i);
		}
		
		System.err.println("--------------ԭ��iterator����-----------------");
		
		//list map set �ȶ�֧��Iterator��
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.err.println(iterator.next());
		}
	}
}
